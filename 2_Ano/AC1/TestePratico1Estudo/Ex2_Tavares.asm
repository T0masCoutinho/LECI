 	.data 
 	.eqv size,8  #SIZE
 	.eqv size2,4 #SIZE/2

array: 	.word 8,4,15,-1987,327,-9,27,16
lenght: .word 8
 	.align 2
str: 	.asciiz "The result is:"
 	.text
 	.globl main

main:
    li $t0,0		#i = 0
    la $t2,array	#$t2 = array
    li $t9,size2	#$t9 = SIZE/2
while:
    lw $t3,0($t2) 	# v = val[i]
    mul $t5,$t9,4	#offset de i + size/2
    add $t7,$t2,$t5	#val[i + size/2]
    lw $t4,0($t7)	#load val[i + size/2] pra $t4
    sw $t4,0($t2)	#stores val[i + size/2] in the position of val[i]
    sw $t3,0($t7)	#stores val[i] in the old position of val[i + size/2]
    bge $t0,size2,fim	
    addi $t0,$t0,1	#i++
    addi $t2,$t2,4	
    j while
fim:
    li $v0,4		#print_string
    la $a0,str
    syscall
    li $t0,0
    la $t8,array
    li $a1,','
ciclo:
    li $v0,1		#print_int10
    lw $a0,0($t8)
    syscall
    li $v0,11		#print_char
    move $a0,$a1
    syscall
    bge $t0,size,final
    addi $t8,$t8,4
    addi $t0,$t0,1
    j ciclo
final:
    jr $ra