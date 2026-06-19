from mm1 import fn_1    ##파일안에 요소1개
import mm1  ##파일전체
import mm2 as zx        ## as : 이름을 zx로 변경
from mm3 import *       ## mm3의 모든 요소

fn_1()
rr = mm1.fn_1()
print(f"rr : {rr}")
rr = mm1.fn_2(5,7)
print(f"rr : {rr}")
print(f"{mm1.aa}, {mm1.bb}")

print(__name__) ##__main__:현재 실행하는 파일

#rr = mm2.fn_3()
rr = zx.fn_3()
print(f"rr : {rr}")
fn_5()
fn_6(123,456)