#Mapa de Registos
#i:		$t0
#j: 		$t1


	.eqv SIZE, 3
	.eqv print_string, 4
	.eqv print_char, 11
	.eqv print_int10, 1
	.data
array:	.word str1, str2, str3
str1:	.asciiz  "Array"
str2:	.asciiz  "de"
str3:	.asciiz  "ponteiros"
str4: 	.asciiz  "\nString #"
	.text
	.globl main

main:
	li $t0, 0
	
while1:
	bge $t0, SIZE, endW
	la $a0, str4
	li $v0, print_string
	syscall
	
	move $a0, $t0
	li $v0, print_int10
	syscall
	
	la $a0, ': '
	li $vo, print_string
	syscall
	
	li $t1, 0
while2:
	la $t2, array
	sll $t3, $t0, 2		# offset = i * 4
	addu $t3, $t2, $t3
	lw $a0, 0($t3)
	addu $a0, $a0, $t1
	lb $a0, 0($a0)
	
	beq
	
	li $v0, print_char
	syscall
	
	la $a0, '-'
	li $v0, print_char
	syscall
	
	addi $t1, $t1, 1
endW2
	
	
	addi $t0, $t0, 1
endW1