result=['bream']*35+['smelt']*14
print(result)


a=[1,2,3,4,5]
b=[4,5,6,7,10]

print(a+b)

for x,y in zip(a,b):
    print(x,y)

# c=[[x,y] for x,y in zip(a,b)]
# print(c[0])
# print(c[1])
# print(c[2])

class AA:
    # self는 자바의 this 와 같다
    def doA(self):
        print("aa")

aa= AA()
# AA aa = new AA() 와 같은거임!!!!





