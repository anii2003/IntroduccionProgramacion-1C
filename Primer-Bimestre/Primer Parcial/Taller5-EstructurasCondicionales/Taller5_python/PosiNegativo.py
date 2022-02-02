print("")
print("***Programa para determinar si un número es positivo o negativo***")
print("")

# Entrada de datos

a = float(input("Ingrese el número: "))

# Proceso

if (a == 0):
    print("El número que ingresó es un número neutro")  #Salida de datos
    print("")

elif a > 0:
    print("El número ",a," es positivo")              #Salida de datos
    print("")

else:
    print("El número ",a," es negativo")                #Salida de datos
    print("")