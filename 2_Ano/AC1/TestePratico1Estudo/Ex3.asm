#Mapa de Registos
#p1:        $t0
#p2:        $t1
#a:        $t2
#b:        $t3
#n_even:    $t4
#n_odd:        $t5


    .eqv N, 5
    .eqv read_int, 5
    .eqv print_int10, 1
    .data
a:   .space 20
ba:  .space 20
    .text

    .globl main
main:
    la $t2, a
    la $t3, ba
    li $t4, 0
    li $t5, 0
    li $t0,0
    li $t1, 0

    move $t0, $t2
while1:
    
    li $t9, N
    addu $t6, $t2, $t9
    bge $t0, $t6, while2

    move $a0, $t0
    li $v0, read_int
    syscall

    addi $t0, $t0, 1
    j while1
    
    move $t0, $t2
    move $t1, $t3
while2:
    
    bge $t0, $t6, while3

if:
  
    rem  $t9, $t0, 2
    beq $t9, 0, else
    addi $t1, $t1, 1
    move $t1, $t0
    addi $t5, $t5, 1

    j while2
else:
    addi $t4, $t4, 1

    addi $t0, $t0, 1
    j while2

while3:
    move $t1, $t3
    addu $t6, $t3, $t5
    bge $t1, $t6, endW
    move $a0, $t1
    li $v0, print_int10
    syscall

    addi $t1, $t1, 1
    j while3
endW:
    jr $ra
	
