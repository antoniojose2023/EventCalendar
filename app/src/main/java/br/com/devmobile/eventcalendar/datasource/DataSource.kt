package br.com.devmobile.eventcalendar.datasource

import br.com.devmobile.eventcalendar.model.Evento

object DataSource {
    fun getEventos(): MutableList<Evento>{

        return mutableListOf(
            Evento(
                nome = "Android Dev Conference 2026",
                data = "15/10/2026",
                hora = "09:00",
                local = "São Paulo, SP",
                descricao = "A maior conferência sobre desenvolvimento Android no Brasil, com foco em Jetpack Compose, arquitetura moderna e novidades do Android 17.",
                organizador = "Comunidade Android BR"
            ),
            Evento(
                nome = "Kotlin Conf Brasil",
                data = "22/11/2026",
                hora = "10:00",
                local = "Belo Horizonte, MG",
                descricao = "Evento focado na linguagem Kotlin, cobrindo tópicos desde Kotlin Multiplatform (KMP) até desenvolvimento backend e boas práticas.",
                organizador = "Kotlin Users Group"
            ),
            Evento(
                nome = "Workshop de Inteligência Artificial Prática",
                data = "05/12/2026",
                hora = "14:00",
                local = "Online",
                descricao = "Aprenda a integrar modelos de IA generativa e LLMs diretamente em aplicações móveis e web com exemplos práticos de código.",
                organizador = "TechAcademy"
            ),
            Evento(
                nome = "Hackathon Web3 & Blockchain",
                data = "15/01/2027",
                hora = "18:00",
                local = "Rio de Janeiro, RJ",
                descricao = "48 horas de maratona de programação desenvolvendo contratos inteligentes e soluções descentralizadas inovadoras.",
                organizador = "CryptoDevs Association"
            ),
            Evento(
                nome = "Fórum de Cibersegurança Avançada",
                data = "10/02/2027",
                hora = "08:30",
                local = "Brasília, DF",
                descricao = "Discussões com especialistas sobre as principais ameaças digitais, LGPD, criptografia e segurança em nuvem corporativa.",
                organizador = "CyberSec Labs"
            ),
            Evento(
                nome = "UX/UI Design Systems Summit",
                data = "03/03/2027",
                hora = "13:00",
                local = "Curitiba, PR",
                descricao = "Estratégias para criação, escalabilidade e manutenção de Design Systems consistentes e acessíveis para grandes equipes.",
                organizador = "Designers Unidos"
            ),
            Evento(
                nome = "Devops Bootcamp: Nuvem e CI/CD",
                data = "18/04/2027",
                hora = "09:00",
                local = "Online",
                descricao = "Treinamento intensivo cobrindo Docker, Kubernetes, e automação de pipelines de entrega contínua na AWS e Google Cloud.",
                organizador = "Cloud Experts"
            ),
            Evento(
                nome = "Global Data Science Forum",
                data = "25/05/2027",
                hora = "10:30",
                local = "Florianópolis, SC",
                descricao = "Painéis sobre Big Data, Engenharia de Dados e modelos preditivos avançados aplicados ao mercado financeiro.",
                organizador = "Data Insights"
            ),
            Evento(
                nome = "Seminário de Computação Quântica",
                data = "12/06/2027",
                hora = "15:00",
                local = "Campinas, SP",
                descricao = "Uma introdução aos algoritmos quânticos e o estado atual do desenvolvimento de hardware quântico no mundo.",
                organizador = "Instituto de Física Avançada"
            ),
            Evento(
                nome = "IoT & Hardware Innovations Expo",
                data = "07/07/2027",
                hora = "09:00",
                local = "Recife, PE",
                descricao = "Feira e palestras com foco em internet das coisas, automação residencial, robótica industrial e cidades inteligentes.",
                organizador = "Porto Digital Center"
            )
        )

    }

}