	.data
	
	
	.text 
	.globl main
main:	ori $t0,$0,0xE543 # substituir val_1 e val_2 pelos
 	ori $t1,$0,0xA3E4 # valores de entrada desejados
 	and $t2,$t0,$t1 # $t2 = $t0 & $t1 (and bit a bit)
 	or $t3, $t0, $t1 # $t3 = $t0 | $t1 (or bit a bit)
 	nor $t4, $t0, $t1 #
 	xor $t5, $t0, $t1
 	
 	nor $t6, $0, $t0
 	
 	jr $ra # fim do programa 
 	
 	####################################
 	#B)
 	# val_1 = 0x1234, val_2 = 0x000F
	# val_1 = 0x1234, val_2 = 0xF0F0
	# val_1 = 0x5C1B, val_2 = 0xA3E4
	
	#$t0 			$t1 		$t2 (AND) 		$t3 (OR) 		$t4 (NOR) 		$t5 (XOR)
	#0x1234 		0x000F		0x00000004		0x0000123f		0xffffedc0		0x0000123b
	#0x1234 		0xF0F0		0x00001030		0x0000f2f4		0xffff0d0b		0x0000e2c4
	#0x5C1B 		0xA3E4		0x00000000		0x0000ffff		0xffff0000		0x0000ffff
	
	##################################
	#C)
	#$t0 (Val) 	$t6 (Val\)
	#0x0F1E		0x00000000
	#0x0614		0xfffff9eb
	#0xE543		0xffff1abc
	
	
	
	