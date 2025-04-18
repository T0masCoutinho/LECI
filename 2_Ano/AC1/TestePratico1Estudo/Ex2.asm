#Mapa de Registos
#i:	$t0
#v:	$t1
#SIZE/2:	$t4
#val[i]:	$t5



	.eqv SIZE, 8
	.eqv print_string, 4
	.eqv print_int10, 1
	.eqv print_char, 11
	.data
val:	.word 8, 4, 15, -1987, 327, -9, 27, 16
str1:	.asciiz "Result is: "
	.text
	.globl main
main:
	li $t0, 0	# int i
	li $t1, 0	#int v
	
while1:
	addi $t0, $t0, 1
	li $t3, 2
	li $t4, SIZE
	div $t4, $t4, $t3 	#SIZE/2
	
	bge $t0, $t4, endW1	#While(++i < (SIZE/2)
	
	la $t1, val		#v = val[0]
	sll $t2, $t0, 2		#offset i*4
	add $t2, $t1, $t2	
	
	lw $t5, 0($t2)		#val[i]
	move $t1, $t5		# v = val[i]
	
	
	sll $t6, $t6, 2
	add $t6, $t0, $t4	#i + (SIZE/2) 
	
	lw $t5, 0($t6)		#val[i + (SIZE/2)] 
	
	move $t6, $t1
	
	j while1

endW1:
	la $a0, str1
	li $v0, print_string
	syscall
	
	li $t0, 0
	
while2:
	bge $t0, SIZE, endW2
	la $t1, val
	addi $t0, $t0, 1	#i++
	sll $t2, $t0, 2
	addu $t2, $t1, $t2	
	lw $t5, 0($t2)		#val[i++]
	move $a0, $t5
	li $v0, print_int10
	syscall
	li $a0, ','
	li $v0, print_char
	syscall
	
	j while2

endW2:
	jr $ra
	
	

	
	
