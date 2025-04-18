#Var Map
# nv: $a0
# pt: $a1
# i:
# j:
# sum:
# **********************************++
#
#
# {				Align		Size		Offset
#	int cc			4		4		0
#	usigned char nm		1		1		4
#	double grade		8		8		5 -> 8
#	char quest[14]		1		14		 16
#	int cq			4		4		30 ->32
#}	t_kvd;					31



	.data
sum:	.double 0.0
	.text
	.globl func3
func3:
	li $t0, 0			#int i = 0
	la $t2, sum
	l.d $f12, 0($t2)		# double sum = 0.0
	
for:	
	bne $t0, 0, endFor
	bge $t0, $a0, endFor
	
	li $t1, 0			#int j = 0
	
do_while:
	sw $v0, quest(
	addu $t3, $a2, 16		
	addu $t3, $t3, $t1
	lb $t4, 0($t3)
	mtc1 $t4, $f2
	cvt.d.w $f2, $f2
	addiu $t1, $t1, 1
	
	addu $t5, $a2, 4
	lb $t6, 0($t5)
	blt $t1, $t6, do_while
	
	addiu $t0, $t0, 1
	addiu $a1, $a1, 31
endFor:
	
					
									
													
																	
																					
																													
	