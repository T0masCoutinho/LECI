# Mapa de registos:
# soma: $t0
# value: $t1
# i: $t2
 	.data
str1: .asciiz "Introduza um numero: "
str2: .asciiz "Valor ignorado\n"
str3: .asciiz "A soma dos positivos e': "
 	.eqv print_string,4
 	.eqv read_int,5
 	.eqv print_int10,1
 	
 	.text
 	
 	.globl main
main:
	li $t0,0 			# soma = 0;
 	li $t2, 0 			# i = 0;
 	
while1: 
	bgt $t2, 5, endw		# while(i < 5) {
	
	li $v0, print_string		
	la $a0, str1			
	syscall 			#print_str(str1);
	
	li $t1, read_int		#value = read_int();
	
if1:
	ble $t1, 0, else1		#if(value > 0){
	add $t0, $t0, $t1		#	soma += soma + value;
	j	endif1
	
else1: 	
	li $v0, print_string		
	la $a0, str2
	syscall				#print_str(str2);
	
endif1:
	addi $t2, $t2, 1 		# i++;
	j	while1			# }
	
	
endw:	
	li $v0, print_string
	la $a0, str3
	syscall				#print_str(str3);
	
	li $v0, print_int10
	move $a0, $t0
	syscall				#print_int10(soma);
	
	jr $ra				#}
