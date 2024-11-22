declare i32 @printf(i8*, ...)
@format_int = private unnamed_addr constant [4 x i8] c"%d\0A\00"
@.str_true = private unnamed_addr constant [18 x i8] c"x es menor que z\0A\00", align 1
@.str_false = private unnamed_addr constant [21 x i8] c"x no es menor que z\0A\00", align 1

define i32 @main() {
  %x = alloca i32
  store i32 10, i32* %x
  %z = alloca i32
  store i32 20, i32* %z
  %r = alloca i32
  store i32 5, i32* %r
  %a = alloca i32
  store i32 2, i32* %a
  %tmp1 = load i32, i32* %r
  %tmp2 = load i32, i32* %r
  %tmp0 = add i32 %tmp1, %tmp2
  %tmp4 = load i32, i32* %r
  %tmp5 = load i32, i32* %x
  %tmp3 = mul i32 %tmp4, %tmp5
  %tmp7 = load i32, i32* %r
  %tmp8 = load i32, i32* %x
  %tmp6 = sdiv i32 %tmp7, %tmp8
  %myVar = alloca i32
  store i32 3, i32* %myVar
  %result = alloca i32
  %tmp9 = load i32, i32* %x
  %tmp10 = load i32, i32* %z
  %tmp11 = icmp slt i32 %tmp9, %tmp10
  br i1 %tmp11, label %label0, label %label1
label0:
  call i32 (i8*, ...) @printf(i8* getelementptr ([18 x i8], [18 x i8]* @.str_true, i32 0, i32 0))
  br label %label2
label1:
  call i32 (i8*, ...) @printf(i8* getelementptr ([21 x i8], [21 x i8]* @.str_false, i32 0, i32 0))
  br label %label2
label2:
  ret i32 0
}