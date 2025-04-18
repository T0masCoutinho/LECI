#Tabela de Registos
# val:	$t0
#n:	$t1
#max:	$t2
#min:	$t3

	.eqv print_string, 4
	.eqv print_int10, 1
	.eqv print_char, 11
	.eqv read_int, 5
	.data
str1:	.asciiz  "Digite ate 20 inteiros (zero para terminar): "
str2:	.asciiz  "Máxio/mínimo são: "
	
	.text
	.globl main
	
main:
	li $t0, 0
	li $t1, 0
	li $t2, 0x80000000
	li $t3, 0x7FFFFFFF
	
	la $a0, str1
	li $v0, print_string
	syscall
	
while:
	bge $t1, 20, endW
	li $v0, read_int   # Set up for read integer
	syscall             # Perform the syscall
	move $t0, $v0       # Store the read integer in $t0
	beq $t0, 0, endW
if1:
	ble $t0, $t2, if2
	move $t2, $t0
if2:
	bge $t0, $t3, endI
	move $t3, $t0
	
endI:
	addi $t1, $t1, 1
	j while
endW:
	la $a0, str2
	li $v0, print_string
	syscall
	move $a0, $t2
	li $v0, print_int10
	syscall
	li $a0, ':'
	li $v0, print_char
	syscall
	move $a0, $t3
	li $v0, print_int10
	syscall
	
	jr $ra
