
print("***Programa para calcular el costo total de una llamada swgún su duración***" '\n')

#Ingrese los datos requeridos
nombre = input("Ingrese el nombre de usuario: " '\n')
tiempo_llamada = float(input("Ingrese el tiempo de duración de la llamada: " '\n'))
costomin_llamada = float(input("Ingrese el costo por minuto de la llamada: " '\n'))

#Proceso

costo_final = tiempo_llamada * costomin_llamada

#Salida de datos

print("El costo total de la llamada es:",'\n',costo_final)
