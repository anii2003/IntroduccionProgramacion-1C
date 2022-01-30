print("")

#Inicialización de variables
num = 0; suma = 0; i = 1; suma = 0; n = 1000; media = 0

# Ingreso de datos
print("***Programa cuya suma de números no supere a 1000****")
num = int(input("Ingrese un número: "))

suma = num

while (suma < n):
    num = int(input("Ingrese otro número: "))
    suma = suma + num
    i = i + 1

if (suma <= 1000):
    print("La suma es: ",suma)
    media = suma/i
    print("Usted ingresó ",i," números ")
    print("La media de ",suma," es: ",media)

else:
    suma = suma - num
    print("El resultado supera a 1000, la suma queda en: ",suma)

    if (suma <= n):
        media = suma/(i - 1)
        print("Usted ingresó ",i," números")
        print("La media de ",suma," es: ",media)