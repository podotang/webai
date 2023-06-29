a=[1,2,3,4,5]
# for item in a:
#     print(item)

bream_length = [25.4, 26.3, 26.5, 29.0, 29.0, 29.7, 29.7, 30.0, 30.0, 30.7, 31.0, 31.0, 31.5, 32.0, 32.0, 32.0, 33.0, 33.0, 33.5, 33.5, 34.0, 34.0, 34.5, 35.0, 35.0, 35.0, 35.0, 36.0, 36.0, 37.0, 38.5, 38.5, 39.5, 41.0, 41.0]
bream_weight = [242.0, 290.0, 340.0, 363.0, 430.0, 450.0, 500.0, 390.0, 450.0, 500.0, 475.0, 500.0, 500.0, 340.0, 600.0, 600.0, 700.0, 700.0, 610.0, 650.0, 575.0, 685.0, 620.0, 680.0, 700.0, 725.0, 720.0, 714.0, 850.0, 1000.0, 920.0, 955.0, 925.0, 975.0, 950.0]

print(len(a))
print(len(bream_length))
print(len(bream_weight))

import matplotlib.pyplot as plt

# 터미널에 : pip insatll matplotlib 입력! 하면 자동 다운
# fig1=plt.figure()
# plt.figure(1)
# plt.plot(t1, f(t1))



plt.scatter(bream_length,bream_weight)
# scatter 뭐 그리는 함수임
plt.xlabel('length')
plt.ylabel('weight')
plt.savefig('a.png')
plt.show()

# import folder.aaa as my
# folder안에 aaa를
# my.doA()
smelt_length = [9.8, 10.5, 10.6, 11.0, 11.2, 11.3, 11.8, 11.8, 12.0, 12.2, 12.4, 13.0, 14.3, 15.0]
smelt_weight = [6.7, 7.5, 7.0, 9.7, 9.8, 8.7, 10.0, 9.9, 9.8, 12.2, 13.4, 12.2, 19.7, 19.9]


#scatter가 그래프에 점을 찍어주는기능
#savefig를 먼저하고 show를 사용하여야한다.
fig2=plt.figure()
plt.scatter(smelt_length,smelt_weight)
plt.savefig('b.png')
plt.show()

plt.scatter(bream_length, bream_weight)
plt.scatter(smelt_length, smelt_weight)
plt.savefig('c.png')
plt.show()

length = bream_length+smelt_length
weight = bream_weight+smelt_weight

fish_data = [[x, y] for x, y in zip(length, weight)]
fish_target=[1]*35+[0]*14
print(fish_data[:5])
print(fish_target[:5])

print(fish_data[:40])
print(fish_target[:40])

# print(length[:5])
# print(weight[:5])


# print(length[:5])
# print(weight[:5])

# sklearn는 구글 어쩌구꺼 가져옴 KNeighborsClassifier는 클래스 클래스 시작은 대문자
from sklearn.neighbors import KNeighborsClassifier
#KNeighborsClassifier안에 데이터 학습을 진행하는것이들어있다!!
#fit 가 학습하라는 함수
knclf = KNeighborsClassifier()
knclf.fit(fish_data, fish_target)

predvalue = knclf.predict([[10,20]])
print(predvalue)

#정확도에대해 나타냄
knclf.score(fish_data, fish_target)
