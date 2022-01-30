print("")
print("***Programa que determina si la diferencia de dos números es divisor exacto de uno de ellos")
print("")

# Declaración e inicialización de variables 

num1 = 0
num2 = 0
dif = 0

num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))
print("")

# Proceso

if num1 >= num2:
    dif = num1 - num2
    print("El resultado de la diferencia es: " ,dif)
    print("")

else:
    dif = num2 - num1
    print("El resultado de la diferencia es: " ,dif)
    print("")

if dif > 0:
    dif = num1 - num2

else:
    dif == 0
    print("***Los valores ingresados generan indeterminaciones, por favor vuelva a ingresar***")
    print("")

if (num1 % dif == 0) and (num2 % dif == 0):
    print("Dicha diferencia es divisor exacto de ", num1, " y ", num2)
    print("")

else:
    if num1 % dif == 0:
        print("Dicha diferencia es un divisor exacto de ", num1)
        print("")
    elif num2 % dif == 0:
        print("Dicha diferencia es un divisor exacto de ", num2)
        print("")
    else: 
        print("Dicha diferencia NO es un divisor exacto ni de ",num1," ni de ",num2)
        print("")