; ModuleID = 'output.ll'
source_filename = "output.ll"

@str = private unnamed_addr constant [17 x i8] c"x es menor que z\00", align 1

; Function Attrs: nofree nounwind
define noundef i32 @main() local_unnamed_addr #0 {
label0:
  %puts = tail call i32 @puts(ptr nonnull dereferenceable(1) @str)
  ret i32 0
}

; Function Attrs: nofree nounwind
declare noundef i32 @puts(ptr nocapture noundef readonly) local_unnamed_addr #0

attributes #0 = { nofree nounwind }
