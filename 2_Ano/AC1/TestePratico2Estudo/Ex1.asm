#Var Map
# f1: 
# k: 
# av: $a2
# i: 
# res: 

	.data
str1:	.asciiz "Invalid argc"
	.align 2
	.eqv SIZE, 15
	.text
	.globl func1

func1:
	addiu $sp, $sp, -24
	sw $s4, 20($sp)		#res
	sw $s3, 16($sp)
	sw $s2, 12($sp)		#av[]
	sw $s0, 8($sp)		#int k
	sw $s1, 4($sp)		#
	sw $ra, 0($sp)	
	move $s1, $a0		#guardado f1
	move $s2, $a2		#guardado av[]
	move $s0, $a1		#guardado k

	
if:		
	blt $s0, 2, endIf	#k >= 2
	bgt $s0, SIZE, endIf 	#&& k <= SIZE
	
	li $s3, 2		#int i = 2
	
while_do:
	addu $t1, $s3, $s2 	# $t1 = i + av[]
	lw $a0, 0($t1)
	jal toi
	addu $t2, $s3, $s1	# $t2 = i + f1
	sw $v0, 0($t2)		#guardar valor de $t2
	addiu $s3, $s3, 1
	blt $s3, $s0, while_do
	
	move $a0, $s1 
	move $a1, $s0
	jal avz
	move $a0, $v0
	li $v0, 1
	syscall
	move $v0, $a0
endIf:
	la $a0, str1
	li $v0, 4
	syscall
	li $v0, -1	
	
	lw $ra, 0($sp)
	lw $s1, 4($sp)
	lw $s0, 8($sp)
	lw $s2, 12($sp)
	lw $s3, 16($sp)
	lw $s4, 20($sp)
	addiu, $sp, $sp, 20
	
	jr $ra
	
	
	
	
	
	
	
