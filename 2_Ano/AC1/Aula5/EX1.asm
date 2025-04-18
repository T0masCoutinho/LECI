#Mapa 
#i:	$t0
#lista:	$t1
#lista + i $t2

	.data
	.eqv SIZE, 5
	.eqv print_string,4
	.eqv read_int, 5
	.align 2
lista:	.space 20		#SIZE * 4
str: 	.asciiz 		"Introduza um numero: "
	.text
	.globl main
	
	
main:
	li $t0, 0

while:
	bge $t0, SIZE, endW	#while(i < SIZE)
	li $v0, print_string
	la $a0, str
	syscall 		#print_string(str)
	
	li $v0, read_int
	syscall
	la $t1, lista		#$t1 = lista
	sll $t2, $t0, 2	
	addu $t2, $t2, $t1
	sw $v0, 0($t2)		#lista[i] = read_int()
	
	addi $t0, $t0, 1	#i++
	j while
endW:
	jr $ra
	
#t0: 1, 2, 3, 4, 5
#t1: 268500992, 268500992, 2147479552, 2147479552, 268500992
#t2: 268500992, 268500996, 2147479556, 2147479556, 268501008
#v0: 5, 5, 5, 5, 10