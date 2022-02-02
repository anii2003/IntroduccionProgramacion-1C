print("")
# Inicializar las variables
sdn = 0; nd = 0

# Ingrese los datos
print("Número de cifras y la suma de las mismas")
n = int(input("Por favor, digite un número: "))
cn = n

# Proceso
if (cn < 0):
    cn = -cn

if(cn == 0):
    # Si el número es 0, entonces n tiene 1 dígito
    # y la suma de sus cifras es cero
    sdn = 0
    nd = 1

else: 
    while (cn > 0):
        # Se acumulan la suma de las cifras
            sdn = sdn + (cn % 10)
            nd = nd + 1

        #Se descarta la cifra sumada
            cn = cn//10

print(n," tiene ",nd," dígitos y la suma de los dígitos de ",n," es:",sdn)
