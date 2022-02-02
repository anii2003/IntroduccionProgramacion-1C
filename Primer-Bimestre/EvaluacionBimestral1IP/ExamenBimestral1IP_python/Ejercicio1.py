print("")
# Inicializar las variables
num = 0; opc = 0; par = 0; impar = 0; posi = 0; nega = 0
mult3 = 0; primo = 0; j = 0; divisor = 0

# Ingreso de datos y proceso
print("Programa para verificar si un número es positivo, negativo, par o impar")
num = int(input("Ingrese un número a verificar: "))
print("Seleccione la opción a realizar")
print("1. Verificar si es par o impar")
print("2. Verificar si es positivo o negativo")
print("3. Verificar si es múltiplo de 3")
print("4. Verificar si es primo")

print("")
opc = int(input("Ingrese una opción: "))

if (opc == 1):
    if (num%2==0):
        print("El número ingresado es par")
    else:
        print("El número ingresado es impar")

elif (opc == 2):
    if (num > 0):
        print("El número es positivo")
    if (num < 0):
        print("El número ingresado es negativo")
    if (num == 0):
            print("El número ingresado es neutro")

elif (opc == 3):
    if (num % 3 == 0):
        print("El número es múltiplo de 3")
    else:
        print("El número no es múltiplo de 3")

elif (opc == 4):
    j = 1
    while (j <= num):
        if (num%j == 0):
            divisor = divisor + 1
        
        j = j + 1

    if (divisor == 2):
        print("El número",num,"es primo")
    else:
        print("El número",num,"no es primo")

else:
    print("Opción incorrecta, por favor vuelva a ingresar")