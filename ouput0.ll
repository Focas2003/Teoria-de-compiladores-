; ModuleID = 'output.ll'
source_filename = "output.ll"

@format_int = private unnamed_addr constant [4 x i8] c"%d\0A\00"
@.str_true = private unnamed_addr constant [18 x i8] c"x es menor que z\0A\00", align 1
@.str_false = private unnamed_addr constant [21 x i8] c"x no es menor que z\0A\00", align 1

declare i32 @printf(ptr, ...)

define i32 @main() {
  %x = alloca i32, align 4
  store i32 10, ptr %x, align 4
  %z = alloca i32, align 4
  store i32 20, ptr %z, align 4
  %r = alloca i32, align 4
  store i32 5, ptr %r, align 4
  %a = alloca i32, align 4
  store i32 2, ptr %a, align 4
  %tmp1 = load i32, ptr %r, align 4
  %tmp2 = load i32, ptr %r, align 4
  %tmp0 = add i32 %tmp1, %tmp2
  %tmp4 = load i32, ptr %r, align 4
  %tmp5 = load i32, ptr %x, align 4
  %tmp3 = mul i32 %tmp4, %tmp5
  %tmp7 = load i32, ptr %r, align 4
  %tmp8 = load i32, ptr %x, align 4
  %tmp6 = sdiv i32 %tmp7, %tmp8
  %myVar = alloca i32, align 4
  store i32 3, ptr %myVar, align 4
  %result = alloca i32, align 4
  %tmp9 = load i32, ptr %x, align 4
  %tmp10 = load i32, ptr %z, align 4
  %tmp11 = icmp slt i32 %tmp9, %tmp10
  br i1 %tmp11, label %label0, label %label1

label0:                                           ; preds = %0
  %1 = call i32 (ptr, ...) @printf(ptr @.str_true)
  br label %label2

label1:                                           ; preds = %0
  %2 = call i32 (ptr, ...) @printf(ptr @.str_false)
  br label %label2

label2:                                           ; preds = %label1, %label0
  ret i32 0
}
