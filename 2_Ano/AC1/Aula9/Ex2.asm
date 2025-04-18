	.data
fct1:	.double 0.0, 100.0, 5.0, 9.0, 32.0
	.text
	.globl main
#ft:	$f0
#ct:	$f2
main:
	addiu $sp, $sp, -4
	sw $ra, 0($sp)
	la $t0, fct1
	l.d $f2, 0($t0)
	l.d $f4, 8($t0)
	
while:
	c.le.d $f2, $f4
	bc1f endw
	li $v0, 7
	syscall
	mov.d	$f12,$f0
	jal f2c
	mov.d $f2, $f0
	li $v0, 3
	syscall
	
	j while
	
endw:
	lw $ra, 0($sp)
	addiu $sp, $sp, 4
	li $v0, 0
	jr $ra
	
#######################################################################3

f2c:					#double f2c(double ft)
	la $t0, fct1			
	l.d $f2, 16($t0)
	l.d $f4, 24($t0)
	l.d $f6, 32($t0)
	sub.d $f0, $f12, $f6
	mul.d $f0, $f0, $f2
	div.d $f0, $f0, $f4
	jr $ra
	
	