# bit: $t0
# value: $t1
# i: $t2
# flag: $t6	
	
	.data
	
str1: .asciiz "Introduza um numero: "
str2: .asciiz "\nO valor em binário e': "

	.eqv print_char,11
 	.eqv read_int,5
 	.eqv print_string, 4
 	
 	.text
 	.globl main
main:
	
	li $v0, print_string	
	la $a0, str1
	syscall			# print_string("Introduza...")
	
	li $v0, read_int
	syscall
	or $t1, $v0, $0		# value = read_int()
	
	li $v0, print_string
	la $a0, str2
	syscall			# print_string("O valor é...")
	
	li $t2, 0		# int i = 0;
	li $t6, 0		# int flag = 0;
	
while1: 
				# while (i < 32) {
	bge $t2, 32, endw
	
	rem $t5, $t2, 4		# i % 4 		
			
	srl $t0, $t1, 31	# 	bit = value >> 31;
	
if3: 
	bne $t6, 1, bit_compare		#	if flag == 1
	j if2
	
bit_compare:
	beq $t0, 0, else3		# if bit != 0

	li $t6, 1
if2:
	bne $t5, 0, else2	# 	if (i % 4 == 0) 
	li $v0, print_char	
	li $a0, ' '
	syscall
	
else2:
	li $v0, print_char
	addi $t4, $t0, '0'
	or $a0, $t4, $0 
	syscall
	
	

#	li $v0, print_char	
#	addi $t4, $t0, '0'
#	or $a0, $t4, $0 
#	syscall
#if:
#	beq  $t0, 0, else
#	li $v0, print_char
#	li $a0, '1'
#	syscall
#	j	endif
#
#else:
#	li $v0, print_char
#	li $a0, '0'
#	syscall 
#	
#	
#endif:
else3:
	sll $t1, $t1, 1
	
	addi $t2, $t2, 1
	j	while1
	
endw:
	jr $ra
