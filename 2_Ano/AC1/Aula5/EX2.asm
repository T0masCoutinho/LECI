#Mapa de Registos
#p: 		$t0
#*p:		$t1

#lista+Size:	$t2

	.data
	.eqv SIZE 10
	.eqv print_string, 4
	.eqv print_int10, 1
lista:	.word 8, -4, 3, 5, 124, -15, 87, 9, 27, 15
str:	.asciiz "\nConteudo do array: \n"
	.text
	.globl main

main:
	li $v0, print_string
	la $a0, str
	syscall
	la $t0, lista
	li $t1, 0($t0)
	