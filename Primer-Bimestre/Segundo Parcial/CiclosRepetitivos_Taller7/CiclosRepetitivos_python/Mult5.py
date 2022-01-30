print("")
# Inicializar las variables
i = 1; n = 100; mult = 0; num = 0; num1 = 0
print("***Programa para conocer los múltiplos de 5***")

for i in range(1,101):
    num = num + 1
    if (num % 5 == 0):
        print("El número ",num," es múltiplo de 5")
print(n)
print("*****El buche for ha finalizado******")

print("-----------------")
print("Usando do-while")

i = 1; num1 = 0

while (i <= n):
    num1 = num1 +1
    if (num1%5==0):
        print("El número ",num1," es múltiplo de 5")

    i = i + 1

print(n)
print("*****El buche while ha finalizado******")