#Mapa de Registos
#p:		$t0
#pultimo: 	$t1




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
	la $t0, array			#p = array[0]
	li $t2, SIZE
	sll $t2, $t2, 2			#offset = i * 4
	addu $t1, $t0, $t2		#pultimo = array + SIZE = 3
	
while: 
	bge $t0, $t1, endW		#while( p < pultimo)
	lw $a0, 0($t0)
	li $v0, print_string		#print_string(*p)
	syscall
	li $a0, '\n'
	li $v0, print_char
	syscall
	
	
	
	addi $t0, $t0, 4		#p++
	j while
endW:
	jr $ra