#Map Register
#res:	$v0
#digit:	$t0	
	
	
	.data
str1:	.asciiz	"2020 e 2024 sao anos bisextos"
	.text
	.globl main
main:
	addiu $sp, $sp, -4		#int main(void)
	sw $ra, 0($sp)			#prologo
	la $a0, str1
	jal atoi			#unsigned int val = atoi(str1)
	move $a0, $v0					
	li $v0, 1
	syscall				#print_in10(val) 
	
	li $v0, 0			#return 0
	lw $ra, 0($sp)
	addiu $sp, $sp, 4
	jr	$ra			#epilogo

#########################################################

atoi:
	li $v0, 0			# res = 0
	li $t9, '0'			#char base = '0'
	
while_atoi:
	lb $t1, 0($a0)			# while (*s 
	blt $t1, '0', endW_atoi		# >= '0'
	bgt $t1, '9', endW_atoi		#  && *s <= '9' )
	addiu $a0, $a0, 1		#s++
	
	#addi $t0, $t1, -0x30
	#or
	sub $t0, $t1, $t9		#digit = *s++ - '0'
	
	mulu $v0, $v0, 10
	addu $v0, $v0, $t0
	j while_atoi
	
endW_atoi:
	jr $ra