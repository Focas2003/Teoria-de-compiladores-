	.text
	.file	"output.ll"
	.globl	main                            # -- Begin function main
	.p2align	4
	.type	main,@function
main:                                   # @main
	.cfi_startproc
# %bb.0:
	subq	$24, %rsp
	.cfi_def_cfa_offset 32
	movl	$10, 16(%rsp)
	movl	$20, 12(%rsp)
	movl	$5, 8(%rsp)
	movl	$2, 4(%rsp)
	movl	$3, (%rsp)
	xorl	%eax, %eax
	testb	%al, %al
	jne	.LBB0_2
# %bb.1:                                # %label0
	movl	$.L.str_true, %edi
	jmp	.LBB0_3
.LBB0_2:                                # %label1
	movl	$.L.str_false, %edi
.LBB0_3:                                # %label2
	xorl	%eax, %eax
	callq	printf@PLT
	xorl	%eax, %eax
	addq	$24, %rsp
	.cfi_def_cfa_offset 8
	retq
.Lfunc_end0:
	.size	main, .Lfunc_end0-main
	.cfi_endproc
                                        # -- End function
	.type	.Lformat_int,@object            # @format_int
	.section	.rodata.str1.1,"aMS",@progbits,1
.Lformat_int:
	.asciz	"%d\n"
	.size	.Lformat_int, 4

	.type	.L.str_true,@object             # @.str_true
.L.str_true:
	.asciz	"x es menor que z\n"
	.size	.L.str_true, 18

	.type	.L.str_false,@object            # @.str_false
.L.str_false:
	.asciz	"x no es menor que z\n"
	.size	.L.str_false, 21

	.section	".note.GNU-stack","",@progbits
