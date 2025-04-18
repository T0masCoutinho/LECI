	.data
	.eqv SIZE, 15
str1:	.asciiz "Invalid argc"
	.text
	.globl main
	
main:
	addiu $sp, $sp, -28
	sw $ra, 0($sp)
	sw $s0, 4($sp)
	sw $s1, 8($sp)
	sw $s2, 12($sp)
	sw $s3, 16($sp)
	sw $s4, 20($sp)
	sw $s5, 24($sp)
	
	blt $a1, 2, else
	bgt $a1, SIZE, else
	
	li $s0, 2		# i = 2
	move $s3, $a0		#guardar $a0
do:
	sll $s4, $s0, 2
	addu $s1, $s3, $s4	#fl[i]
	addu $s2, $a2, $s4	#av[i]
	move $a0, $s2	
	jal toi
	sw $v0, 0($s1)
	addi $s0, $s0, 1
	blt $s0, $a1, do
	
	move $a0, $s3		#copiar fl para $a0
	jal avz
	sw $v0, 0($s5)		# res = avz(fl, k)
	la $a0, $s5
	li $v0, 1		#print_int10(res)
	
else:
	la $a0, str1
	li $v0, 4		#print_string("Invalid argc"
	li $s5, -1
	
	move $v0, $s5		#retun res
	
	lw $s5, 24($sp)
	lw $s4, 20($sp)
	lw $s3, 16($sp)
	lw $s2, 12($sp)
	lw $s1, 8($sp)
	lw $s0, 4($sp)
	lw $ra, 0($sp)
	addiu $sp, $sp, 28
	
	jr $ra			#break
	
	
	
	
	
	