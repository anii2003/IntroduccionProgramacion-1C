print("")
#Inicializar las variables
num1 = 0; num2 = 2; dif = 0

# Datos de entrada
print("***Programa para determinar si la diferencia de dos números es"
        ,"múltiplo de algunos de ellos***")
num1 = (float(input("Ingrese el primer número: ")))
num2 = (float(input("Ingrese el segundo número: ")))
print("")

# Proceso
dif = (num1 - num2) 

if ((num1 % dif == 0) & (num2 % dif == 0)):
    print("La diferencia " ,dif," es divisor de " ,num1," y " ,num2)

elif (num1 % dif == 0):
    print("La diferencia " ,dif," es divisor de " ,num1)

elif (num2 % dif == 0):
    print("La diferencia " ,dif," es divisor de " ,num2)

else: 
    print("La diferencia no es divisor de ninguno de los dos números")

print("")
