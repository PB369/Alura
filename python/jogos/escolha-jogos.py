import adivinhacao
import forca


print("Escolha o seu jogo:")
print("[1] - Adivinhação\n[2] - Forca")
escolha = int(input("->"))

if(escolha == 1):
    print("Jogando adivinhação")
    adivinhacao.jogar()
elif(escolha == 2):
    print("Jogando forca")
    forca.jogar()
