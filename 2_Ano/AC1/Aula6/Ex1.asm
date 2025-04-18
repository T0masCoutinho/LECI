#Mapa de Registos
#i:	$t0
#array[0]: $t1
#

	.eqv SIZE, 3
	.eqv print_string, 4
	.eqv print_char, 11
	.data
array:	.word str1, str2, str3
str1:	.asciiz  "Array"
str2:	.asciiz  "de"
str3:	.asciiz  "ponteiros"
	.text
	.globl main

main:
	li $t0, 0		#i = 0
	
while:
	bge $t0, SIZE, endW	#while(i < SIZE)
	
	la $t1, array		#$t1 = array[0]
	sll $t2, $t0, 2		# offset = i * 4
	addu $t2, $t1, $t2,	# char *p = &(array[i])
	lw $a0, 0($t2)		# $a0 = array[i] omeçando por array[0]
	li $v0, print_string	#print_string(array[i])
	syscall
	li $a0, '\n'
	li $v0, print_char
	syscall
	
	
	addi $t0, $t0, 1	# i++
	j while
endW:
	jr $ra
	
