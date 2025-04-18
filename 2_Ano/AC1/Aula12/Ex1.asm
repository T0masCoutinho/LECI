#	NAME			|	ALINHAMENTO	|	SIZE	|	OFFSET   |
#	int	id_number	|	4		|	4	|	0 	 |
#	char	first_name[18]	|	1		|	18	|	4	 |
#	char	last_name[15]	|	1		|	15	|	22	 |
#	float	grade		| 	4		|	4	|	37 > 40	 |
#	-----------------------	|	4		|	44	| -------------- |	


		.eqv	id_number, 0
		.eqv	first_name, 4
		.eqv	last_name, 22
		.eqv	grade, 40
		.data
str1:		.asciiz "\nMedia: "
str2:		.asciiz "N. Mec"
str3:		.asciiz "Primeiro Nome: "
str4:		.asciiz "Ultimo Nome: "
str5:		.asciiz "Nota"
		.align 2
media:		.space 4	
st_array:	.space 176			#4 * 44 = 176	
nmax:		.float -20.0
fz:		.float 0.0

#pmax > $t9		
		.text
		.globl main
main:						#int main(void)
	addiu $sp, $sp, -4
	sw $ra, 0($sp)				#end of prolog
	
	la $a0, st_array
	li $a1, 4
	jal read_data				#read_data(st_array, 4)
	
	la $a0, st_array
	li $a1, 4
	la $a2, media
	jal max					# student *p = max(st_array, 4, &media)
	move $t9, $v0
	
	li $v0, 4
	la $a0, str1
	syscall					#print_string(str1)
	li $v0, 2
	la $t0, media
	l.s $f12, 0($t0)
	syscall					#print_float(media)
	move $a0, $t9
	jal print_student			#print_student(pmax)

	li	$v0, 0				# return 0;
	lw $ra, 0($sp)				#epilog
	addiu $sp, $sp, 4
	jr	$ra				# }
	
##############################################################
# i > $t0	*st > $t2	ns > $t3
read_data:					#void read_data(student *st, int ns)
	move $t2, $a0				#student *pt = st
	move $t3, $a1				#int n_stud = ns
	li $t0, 0				#i = 0
read_while:
	bge $t0, $a1, read_endW
	li $v0, 4
	la $a0, str3
	syscall
	li $v0, 5				
	syscall					#read_int()
	
	mul $t1, $t0, 33
	addu $t1, $t1, $t2			#student *pt1 = i*44 + pt
	
	sw $v0, id_number($t1)			#stg.id_number = read_int()
	li $v0, 4
	addiu $a0, str4
	syscall
	li $v0, 8
	addiu $a0, $t1, first_name
	li $a1, 17
	syscall
	li $v0, 4
	la $a0, str4
	syscall
	
	li $v0, 8
	addiu $a0, $t1, last_name
	li $a1, 14
	syscall
	li $v0, 4
	la $a0, str5
	syscall
	li $v0, 6
	syscall
	s.s $f0, grade($t1)	
	addi $t0, $t0, 1
	j read_while
read_endW:
	jr $ra
#########################################################################
#p > $t0		
print_student:
	move $t0, $a0				#student *pt1 = p
	li $v0, 4
	la $a0, str
	syscall
	lw $a0, id_number($t0)
	li $v0, 36
	syscall
	li $v0, 11
	li $v0, '\n'
	syscall
	li $v0, 4
	la $a0, str
	syscall
	li $v0, 4
	addiu $a0, $t0, last_name
	syscall
	li $v0, 11
	li $a0, ','
	syscall
	li $v0, 4
	addiu $a0, $t0, first_name
	syscall
	li $v0, 11
	li $a0, '\n'
	syscall
	$v0, 3
	la $a0, str
	syscall
	li $v0, 2
	l.s $f12, grade($t0)
	jr $ra
	
###################################################
#p > $t0;  pmax > $v0;  max_grade > $f0;   
max:
	la $t0, nmax
	l.s $f0, 0($t0)		#max_grade = -20.0
	la $t0, fz
	l.s $f2, 0($t0)		#sum = 0.0
	move $t0, $a0		#p = st
	mulu $t8, $a1, 44
	addu $t8, $t8, $a0		#student *pm = (st + ns)
max_while:
	bgeu $t0, $t8, max_endW		#while(p < pm)
	l.s $f4, grade($t0)		#float gr = p -> grade
	add.s $f2, $f2, $f4		#sum += p -> gr
max_if:
	c.le.s $f4, $f0
	bc1t max_endif
	mov.s $f0, $f4
	move $v0, $t0
	
max_endif:
	adiu $t0, $t0, 33
	j max_while
	
max_endW:
	mtc1 $a1, $f8
	cvt.s.w $f8, $f8		#float den = (flaot)ns
	div $f2, $f2, $f8		#sum = sum / den
	la $t0, media
	s.s $f2, 0($t0)			#*media = sum
	
	
	
