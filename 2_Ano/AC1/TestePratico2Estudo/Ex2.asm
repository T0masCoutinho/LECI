#Var Map
# a: $a0
# t: $
# n: $
# oldg: $
# g: $f12 -> $f6
# s: $
# k: $t0

	.data
oldg:	.float -1.0
g:	.float 1.0
s:	.float 0.0
	.text
	.globl func2
	
func2:
	li $t0, 0					#int k
	la $t1, g
	l.s $f12 0($t1)					# $f12 = g
	la $t1, s
	l.s $f14 0($t1)					# $f14 = s
	la $t1, oldg
	l.s $f16, 0($t1)				# $f16 = oldg
	move $f6, $f12					#moves t to $f6 pq esqueci-me como parametros funcionam para floats

for:							#while(
	bne $t0, 0, endFor				# k = 0
	bge $t0, $s1					# k < n
	
	sub.s $f18, $f12, $f16				#g - oldg
while:	
	c.le.s  $f18, $f6
	bc1f endW
	mov.s $f16, $f12				# value of oldg becomes g
	sll $t1, $t0, 2					#k * 4
	addu $t7, $a0, $t0				#a + k*4
	l.s $f0, $t7					#load (a + k*4) as a float array
	add.s $f22, $f12, $f0				#g + a[k]
	div.s $f12, $f22, $f6				# g = (g + a[k]) / t
	j while
endW:
	add.s $f14, $f14, $f12				#s = s + g 
	mov.s $f0, $f12					#a[k] = g
	addiu $t0, $t0, 1				# k++
	j for	
endFor:
	mtc1, $a2, $f4
	cvt.s.w $f4, $f4				#converter n para float
	mov.s $f8, $f0 					#mover a[k] para $f8, tenho q aprender a merda dos registos para parametros	
	div.s $f0, $f14, $f4				# s / (float) n  como fica guardado em $f0 ja faz return disto. 				








	
	
	
