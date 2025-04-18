##########################################################
###### UNIVERSIDADE DE AVEIRO - ANO LETIVO 2024/25 #######
############# ARQUITETURA DE COMPUTADORES I ##############
##########################################################
# Licenciatura em Engenharia de Computadores e Informática
# Aluno: João Pedro Nunes Vieira
# NMec.: 50458
###########################################################
##################### Aula Prática 11 #####################
###########################################################
#
#	ESTRUTURAS (STRUCT)
#
#	NOTA: Se um ponteiro p apontar para uma estrutura stg, ie, (p->stg)
# e se for incrementado, ie, p++, então p vai avançar não 4 bytes mas sim
# o nº de bytes do SIZE da estrutura (na tabela a baixo seria 44 bytes).
#
#
# Ex1.: b)
# 
#	NOTA IMPORTANTE: No exame temos que fazer a seguinte tabela a baixo (tendo em conta o problema).
#
#	NAME			|	ALINHAMENTO	|	SIZE	|	OFFSET   |
#	int	id_number	|	4		|	4	|	0 	 |
#	char	first_name[18]	|	1		|	18	|	4	 |
#	char	last_name[15]	|	1		|	15	|	22	 |
#	float	grade		| 	4		|	4	|	37 > 40	 |
#	-----------------------	|	4		|	44	| -------------- |	
	.eqv	id_number, 0
	.eqv	first_name, 4
	.eqv	last_name, 22
	.eqv	grade, 40
	.data
str1:	.asciiz	"\nN. Mec: "
str2:	.asciiz	"\nNome: "
str3:	.asciiz	"\nNota: "
stg:	.word	72342
	.asciiz "Napoleao" # Tem que ocupar 18 obrigatóriamente mas só ocupa 9 (com terminador) logo ...
	.space 9 # ... temos de adicionar 9 para fazer os 18 obrigatórios
		 #
		 #
	.asciiz	"Bonaparte" # Tem que ocupar 15 obrigatóriamente mas só ocupa 10 (com terminador) logo ...
	.space 	5 # ... temos de adicionar 5 para fazer os 15 obrigatórios
	.float 	5.1
	.text
	.globl 	main
main:					# int main(void) {
	la	$t0, stg		# student *sp = &stg;
	li	$v0, 4			# 
	la	$a0, str1		#
	syscall				# print_string("\nN. Mec: ");
					#
					# Quero passar um valor e NÃO um endereço, logo (lw):
	lw	$a0, id_number($t0)	# 	
	li	$v0, 36			#
	syscall				# print_intu10(stg.id_number);
					#
	li	$v0, 4			# 
	la	$a0, str2		#
	syscall				# print_string("\nNome: ");
					#
					# Quero passar endereços e NÃO valores, logo:
	addiu	$a0, $t0, last_name	# $a0 = (endereço)stg + (offset)last_name
	li	$v0, 4			# 
	syscall				# print_str("stg.last_name");
	li	$v0, 11			#
	li	$a0, ','		#
	syscall				# print_char(',');
					# Quero passar endereços e NÃO valores, logo:
	addiu	$a0, $t0, first_name	# $a0 = (endereço)stg + (offset)first_name
	li	$v0, 4			#
	syscall				# print_str(stg.first_name);
					#
					#
	li	$v0, 4			# 
	la	$a0, str3		#
	syscall				# print_string("\nNota: ");
					#
	l.s	$f12, grade($t0)	#
	li	$v0, 2			# 
	syscall				# print_float(stg.grade);
					#	
	li	$v0, 0			# return 0;
	jr	$ra			# }