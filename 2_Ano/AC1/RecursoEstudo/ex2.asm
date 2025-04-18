	.data
oldg:	.float -1.0
g:	.float 1.0
s:	.float 0.0
	.text
	.globl main
	
main:
	
for:
	li $t0, 0			# k = 0
	bge $t0, $a2, endFor
while:
	la $t1, oldg
	mtc1 $t1, $f2
	cvt.s.w $f2, $f2		#oldg guardado em $f2
	la $t1, g
	mtc1 $t1, $f4
	cvt.s.w $f4, $f4		#g guardado em $f4
	sub.s $f6, $f4, $f2
	ble $f6, $a1, endWhile		#((g-oldg) > t)
	mov.s $f2, $f4			# oldg = g
	sll $t2, $t0, 3			# k * 8
	mtc1 $f8, $t2			
	cvt.s.w $f8, $f8		#converter k para float
	mtc1 $a0, $f14			# meter a em $f14
	add.s $f10, $f14, $f8		# a+ k = a[k]
	add.s $f12, $f4, $f10		# g + a[k]
	mtc1 $a1, $f18			# meter t em $f18
	div.s $f4, $f12, $f18		# g = (g + a[k]) / t
endWhile:
	addiu $t0, $t0, 1		# k++
	la $t1, s
	mtc1 $t1, $f8			# meter s em $f8
	add.s $f8, $f8, $f4
endFor:
	mtc1 $a2, $f10			# meter n em $f10
	cvt.s.w $f10, $f10
	div.s $f0, $f8, $f10		#return s / (float)n
	
	jr $ra