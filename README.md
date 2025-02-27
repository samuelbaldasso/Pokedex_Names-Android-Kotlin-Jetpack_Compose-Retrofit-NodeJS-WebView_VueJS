# Pokedex Names - Android, Kotlin, Jetpack Compose, Retrofit, NodeJS, WebView VueJS

## Sobre o Projeto

O **Pokedex Names** é um aplicativo Android que permite aos usuários explorar informações de Pokémon através de uma interface moderna desenvolvida com **Jetpack Compose**. Ele utiliza um backend em **Node.js** e integra uma interface web VueJS exibida em um **WebView** dentro do aplicativo.

---

## Tecnologias Utilizadas

### Android (Frontend Mobile)
- **Kotlin**: Linguagem principal de desenvolvimento.
- **Jetpack Compose**: Framework moderno para construção de interfaces declarativas.
- **Retrofit**: Cliente HTTP para comunicação com o backend.
- **WebView**: Exibição de conteúdo web diretamente no app Android.

### Backend
- **Node.js**: Para fornecer dados e lógica de backend.
- **Express**: Framework para criação de APIs RESTful.
- **PokeAPI**: Fonte de dados sobre Pokémon.

### Interface Web
- **VueJS**: Framework frontend para a interface web.

---

## Funcionalidades Principais

- **Pesquisa de Pokémon**: Permite buscar Pokémon por nome ou ID.
- **Lista com Paginação**: Exibe uma lista paginada de Pokémon.
- **Informações Detalhadas**: Mostra habilidades, tipos e outras informações relevantes.
- **Integração Web**: Visualize a interface VueJS diretamente no aplicativo via WebView.

---

## Pré-requisitos

### Para executar o backend:
- **Node.js** (v14 ou superior)
- **npm** ou **yarn**

### Para o app Android:
- Android Studio instalado (recomendado Arctic Fox ou superior).
- Emulador Android ou dispositivo físico.

---

## Como Executar o Projeto

### 1. App Android

#### Clone o repositório do app:
```bash
git clone https://github.com/samuelbaldasso/Pokedex_Names-Android-Kotlin-Jetpack_Compose-Retrofit-NodeJS-WebView_VueJS.git
```

#### Abra o projeto no Android Studio.

#### Execute o aplicativo:
1. Configure um emulador ou conecte um dispositivo físico.
2. Clique em **Run** ou pressione `Shift + F10`.

---

## Estrutura do Projeto

### App Android:
```plaintext
Pokedex-Android-JetpackCompose/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/       # Código principal em Kotlin
│   │   │   ├── res/        # Recursos do app (layouts, strings, etc.)
│   │   │   └── AndroidManifest.xml
│   │   └── test/           # Testes do aplicativo
├── build.gradle            # Configurações do projeto
└── README.md               # Documentação
```

---

## Próximos Passos

- Adicionar suporte offline usando Room para armazenamento local.
- Melhorar o design do WebView e a integração com VueJS.
- Implementar testes unitários e de interface para garantir a qualidade.

---

## Contribuindo

Contribuições são sempre bem-vindas! Para colaborar:

1. Faça um fork do repositório.
2. Crie uma branch para a sua feature (`git checkout -b minha-feature`).
3. Commit suas alterações (`git commit -m 'Adiciona minha feature'`).
4. Envie para o repositório remoto (`git push origin minha-feature`).
5. Abra um Pull Request.

---

## Licença

Este projeto está licenciado sob a [MIT License](./LICENSE).
