 .data
 .eqv size,5

a: .space 20
ba: .space 20
 
 .text
 .globl main

main: 
    li $t0,0 # n_even = 0 
    li $t1,0 # n_odd = 0 
    la $t2,a
    la $t3,ba
    li $t4,size
    mul $t5,$t4,4
    add $t6,$t2,$t5

    
for:
    bge $t2,$t6,proximo
    li $v0,5
    syscall
    sw $v0,0($t2)
    addi $t2,$t2,4
    j for
    
proximo: 
    la $t2,a    
for2:
    bge $t2,$t6,ultimo
    lw $t7,0($t2)
    rem $t8,$t7,2
    beq $t8,0,else
    sw $t7,0($t3)
    addi $t3,$t3,4
    addi $t1,$t1,1
    addi $t2,$t2,4
    j for2
else:
    addi $t0,$t0,1
    addi $t2,$t2,4
    j for2
ultimo: 
    la $t3,ba
    mul $t5,$t1,4
    add $t6,$t5,$t3
for3:
    bge $t3,$t6,fim
    lw $t5,0($t3)
    li $v0,1
    move $a0,$t5
    syscall
    addi $t3,$t3,4
    j for3
fim:
     jr $ra
