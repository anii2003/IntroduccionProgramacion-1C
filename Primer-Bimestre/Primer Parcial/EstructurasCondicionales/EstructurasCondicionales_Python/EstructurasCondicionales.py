print("")

# Inicialización de variables
num = 0

# Entrada de datos
print("Estructuras lógicas condicionales simples")
print("***Programa para verificar si un número es par***\n")

num = int(input("Ingrese un número para verificar: "))

#Proceso

''' #Verificar si un número es par o impar
if (num % 2 == 0):         
    print("El número " ,num ," es par")

else:
    print("El número " ,num ," es impar")
         
#Verificar si un número es par y positivo, o sino es impar
if (num % 2 == 0):
            
    if (num > 0):
        print("El número " ,num ," es par y positivo")

else:
    print("El número " ,num ," es impar") '''
        
if ((num % 2 == 0) & (num > 0)):          
    print("El número " ,num ," es par y positivo")

else:
    if (num % 2 == 0):
        print("El número " ,num ," es par")
    else:
        print("El número " ,num ," es impar")

