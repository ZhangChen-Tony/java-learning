def calc(a,b,c,d,e,f,x):
    return(a*x**5+b*x**4+c*x**3+d*x**2+e*x+f)
#计算函数
a = int(input('a'))
b = int(input('b'))
c = int(input('c'))
d = int(input('d'))
e = int(input('e'))
f = int(input('f'))
#数值输入
pre = float(input("精确度"))
step = float(input('跨度？（建议与精确度在同一数量级，且不超过精确度）'))
#精确度输入，可替换为默认值
x = 1
diff = 1000
boo = True
delll = 0.0000000001
while boo:
    boo = (diff>pre or diff<-1*pre)
    diffcheck = diff
    diff = calc(a,b,c,d,e,f,x)
    x = x+0.00001
    diff2 = calc(a,b,c,d,e,f,x)
    slope = (diff2-diff)/0.00001
    if slope>0:
        slope = -1/slope
    else:
        slope = -1/slope
    delta = slope*diff2*step
    if (delta<0.000101 and delta>-0.000101):
        delta = delta*8
    x = x+delta
   # print("diff = ", diff)
    if diffcheck == diff:
        print("步长太小，精确值太小！实际精确值为%s" %diff)
        break
print("x = ",x)
aaa = input()#占位符 不然看不到结尾
