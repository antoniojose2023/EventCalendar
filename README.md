# 📅 Event Calendar - Aplicativo Android

![Android](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Min SDK](https://img.shields.io/badge/Min_SDK-24-1F6F64?logo=android&logoColor=white)
![Target SDK](https://img.shields.io/badge/Target_SDK-36-1F6F64?logo=android&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-C1622D)

O **Event Calendar** é um aplicativo Android nativo desenvolvido em **Kotlin** para consulta, busca e visualização detalhada de eventos da área de tecnologia e comunidade. O aplicativo apresenta uma interface limpa e moderna, transição de tela com animação Lottie, busca de eventos em tempo real e tela de detalhes rica em informações.

---

## 📱 Capturas de Tela (Screenshots)

| Tela de Splash (Lottie) | Lista de Eventos & Busca | Detalhes do Evento |
| :---: | :---: | :---: |
|<img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/a242b68f-5a17-4362-84ec-a01210fde1d1" /> | <img width="1080" height="2424" alt="Image" src="https://github.com/user-attachments/assets/61d60eb1-ee0c-4699-854e-86fd746be7ab" /> | <img src="screenshots/detalhes.png" width="250" alt="Detalhes do Evento"/> |

---

## ✨ Funcionalidades Principais

- 🚀 **Splash Screen Animada**: Tela inicial com animação fluida alimentada por **Lottie Animation** e redirecionamento automático com efeito *fade*.
- 🔍 **Busca em Tempo Real**: Componente `SearchView` integrado ao `RecyclerView` para filtragem dinâmica dos eventos conforme a digitação.
- 📋 **Listagem Dinâmica de Eventos**: Exibição dos eventos cadastrados em cartões estilizados (`CardView`), com tag da categoria, título, data, horário e local.
- ℹ️ **Visualização de Detalhes**: Tela dedicada exibindo todas as informações completas do evento selecionado (título, categoria, data, horário, localização, descrição estendida e organizador).
- 🎨 **Design System Personalizado**: Layout moderno utilizando paleta de cores customizada (`#1F6F64`, `#EAF3E9`, etc.), cantos arredondados, ícones indicativos e botões com feedback tátil.
- 🔙 **Navegação Fluida**: Navegação segura entre telas via `Intent` e botão de retorno no cabeçalho da tela de detalhes.

---

## 🛠️ Tecnologias e Bibliotecas

- **Linguagem**: [Kotlin](https://kotlinlang.org/)
- **Interface de Usuário**:
  - `ViewBinding` para vincular os componentes de layout sem `findViewById`.
  - `ConstraintLayout` & `CardView` para estruturação e elevação dos cards.
  - `RecyclerView` para gerenciamento e renderização de listas performáticas.
- **Animações**: [Lottie for Android](https://github.com/Airbnb/lottie-android) (`com.airbnb.android:lottie`)
- **Componentes Jetpack & AndroidX**:
  - `AppCompat`, `Activity KTX`, `Core KTX`, `Material Components`.
- **Arquitetura & Dados**:
  - Camada de dados desacoplada com Singleton `DataSource`.
  - Transferência de dados via `Intent` com objeto `Serializable` (`Evento`).

---

## 📁 Estrutura do Projeto

```
br.com.devmobile.eventcalendar
├── datasource/
│   └── DataSource.kt              # Repositório de dados em memória dos eventos
├── model/
│   └── Evento.kt                  # Classe de modelo de dados do Evento (Serializable)
├── view/
│   ├── SplashScreenActivity.kt    # Activity de Splash Screen com animação Lottie
│   ├── EventosActivity.kt         # Activity principal com lista e campo de busca
│   └── DetalhesEventoActivity.kt # Activity com os detalhes do evento selecionado
├── AdapterEventos.kt              # Adapter e ViewHolder do RecyclerView

```

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Android Studio** (Ladybug ou versão recente)
- **JDK 11** ou superior
- Dispositivo Android físico ou Emulador (Android 7.0 / API 24 ou superior)

### Passos de Instalação

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/event-calendar.git
   ```

2. **Abrir no Android Studio:**
   - Abra o Android Studio, selecione **Open** e navegue até o diretório do projeto clonado.

3. **Sincronizar as dependências do Gradle:**
   - Aguarde até que o Gradle termine de carregar as dependências.

4. **Executar a aplicação:**
   - Selecione seu emulador ou dispositivo físico e pressione **Run (Shift + F10)**.

---

## 📄 Licença

Este projeto é desenvolvido para fins educacionais e de portfólio. Livre para estudo e modificações sob a licença [MIT](LICENSE).

---

Desenvolvido com ❤️ para a comunidade Android!
