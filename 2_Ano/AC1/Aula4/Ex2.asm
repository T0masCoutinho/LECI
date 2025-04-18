#Mapa de Registos
#num : $t0
#p : $t1
#*p : $t2
	.data
	.eqv SIZE, 20
	.eqv read_string, 8
	.eqv print_int10, 1
str:	.space 21		#para saber que o '\0' 
				#ou seja, ter espaço para o bit terminador
	.text
	.globl main
	
main: 
	la	$a0, str		# $a0 = str[0]
	li 	$a1, SIZE
	li	$t0, 0
	la	$t1, str
	li	$v0, read_string
	syscall				# read_string(str, SIZE)
	
	la	$t1, str
	
while: 
	lb $t2, 0($t1)
	beq $t2, '\0', endW
	blt $t2, '0', endIf
	bgt $t2, '9', endIf
	addi $t0, $t0, 1
	
endIf:
	addiu $t1, $t1, 1
	j while
endW:
	li	$v0, print_int10
	move	$a0, $t0
	syscall
	
	jr	$ra 
	
	
	
