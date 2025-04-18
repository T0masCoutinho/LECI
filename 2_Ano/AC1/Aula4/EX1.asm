# Mapa de registos
# num: $t0
# i: $t1
# str: $t2
# str+i: $t3
# str[i]: $t4 

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
	li	$a1, SIZE
	li	$v0, read_string
	syscall				# read_string(str, SIZE)
	
	li	$t0, 0
	li	$t1, 0
	
while:	
	la	$t2, str
	addu 	$t3, $t2, $t1
	lb 	$t4, 0($t3)
	beq 	$t4, '\0' ,endW
	
if:
	blt 	$t4, '0', endIf
	bgt 	$t4, '9', endIf
	addi	$t0, $t0, 1 

endIf:	
	addi	$t1, $t1, 1
	j	while
	
endW: 
	li	$v0, print_int10
	move	$a0, $t0
	syscall
	
	jr	$ra 
	
	
#Endereço de str ($t2)			Endereço de str[i]($t3)		str[i]($t4)		i($t1)		num($t0)
#0x10010000 				0x10010000				 0		0 		0 			Val. iniciais
#0x10010000 				0x10010001				41		1		1			Fim 1ª iter.
#0x10010000 				0x10010002				43		2		1			Fim 2ª iter.
#0x10010000  				0x10010003				31		3		1			Fim 3ª iter.
#0x10010000 				0x10010004				2d		4		1			Fim 4ª iter.
#0x10010000 				0x10010005				4c		5		1			Fim 5ª iter.
#0x10010000  				0x10010006				61		6		1			Fim 6ª iter.
#0x10010000  				0x10010007				62		7		1			Fim 7ª iter.
#0x10010000  				0x10010008				73		8		1			Fim 8ª iter.
	
	
	
	
	
	
	
	