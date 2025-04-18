
	
	.data
str1:	.asciiz "Arquitetura de Computadores"
	.text
	.globl main
main:
	
	addiu $sp, $sp, -4
	sw $ra, 0($sp)
	la $a0, str1
	jal strlen
	move $a0, $v0
	li $v0, 1
	syscall
	li $v0, 0
	lw $ra, 0($sp)
	addiu $sp, $sp, 4
	jr $ra
	
#----------------------------------------------------------
#$v0 > len
strlen:
	li $t0, 0			#len = 0
	
str_while:				#while(1)
	lb $t0 , 0($a0)			#char aux = *s
	addiu $a0, $a0, 1		#s++
	beq $t0, '\0', str_endW		# if (aux = '\0') break
	addi $t0, $t0, 1		#len++
	j str_while
str_endW: 
	move $v0, $t0
	jr $ra
	
	