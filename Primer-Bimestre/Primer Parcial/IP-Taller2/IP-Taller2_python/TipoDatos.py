print("")
print("***Programa para conocer los datos en python***")
print("")

# Declarar las variables de tipo entero
num1 = 10
num2 = 13

# Declarar variables de tipo decimal
num3 = 45.789
num4 = 23.9

# Declarar variables de tipo caracter
encender = 'S'
encender = 'N'

# Declarar variables de tipo cadena
cadena = "Ana Carolina"
apellido = "Churo Briceño"

#Operadores aritméticos

suma = 10 + 15
suma = num1 + num2
print(suma)

print("La suma es:" ,suma, "puntos")

suma1 = 14 + 34
print(suma1)

mult = 13 * 23
mult1 = num1 * num2
print(mult1)

div = 34.5/12.4
div1 = num1/num2
print(div1)

print("--Funciones Matemáticas--")
print(pow(2,4))
print(max(12,10))
print(min(45,1))

# operadores condicionales

print("-- Operadores condicionales --")
a = 34
b = 7

print(a > b)
print(a >= b)
print(a < b)
print(a <= b)
print(a == b)
print(a !=b)

# Operadores lógicos
print("-- Operadores Lógicos --")
print("--Conjunción -- AND --")
print(True & True)          #True
print(True & False)         #False
print(False & False)        #False

print("--------------------------")
print((a > b) & (a >= b))          #True
print((a == b) & (b > a))          #False

print("-- Disyunción -- OR --")
print(True|True)                   #True
print(True|False)                  #True
print(False|False)                 #False

print("-- Negación --")
print(not True)                   #False
print(not False)                  #True
