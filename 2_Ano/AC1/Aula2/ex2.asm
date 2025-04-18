	.data
	
	.text
	.globl main
main:
	li $t0,0x862A5C1B # instrução virtual (decomposta
 			  # em duas instruções nativas)
 	sll $t2,$t0,4 	  # shift left logical 1 bit 
 	srl $t3,$t0,4 	  # shift right logical 1 bit
 	sra $t4,$t0,4    # shift right arithmetic 1 bit (preserva 2's complement)
 	
 	
 	ori $t5, $0, 2
 	srl $t6, $t5, 1
 	
 	
 	jr $ra # fim do programa
 	#B)
 	#t0	 		t2		t3		t4
 	#0x12345678, 1		0x2468acf0	0x091a2b3c	0x091a2b3c
 	#0x12345678, 4		0x23456780	0x01234567	0x01234567
 	#0x12345678, 16		0x5c1b0000	0x0000862a	0xffff862a
	#0x862A5C1B, 2		0x18a9706c	0x218a9706	0xe18a9706
	#0x862A5C1B, 4		0x62a5c1b0	0x0862a5c1	0x0862a5c1
	
	#C)
	#Address: 0x0862a5c1
	