print("")
# Inicializar las variables
i = 0; n = 0; num1 = 0; num2 = 0; mult3 = 0; menor = 0
# Ingreso de datos
num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))
# Proceso

if (num1 < num2):
    menor = num1
    i = menor
    n = num2

if (num2 < num1):
    menor = num2
    i = menor
    n = num1

while (i <= n):
    if (i % 3 == 0):
        print(i," es múltiplo de 3")
    i = i + 1
    