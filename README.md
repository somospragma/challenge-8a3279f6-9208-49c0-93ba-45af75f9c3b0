# Fortalecimiento de Habilidades en Manejo de Excepciones y Depuración

En un sistema de gestión de cartera de inversiones, es crucial manejar las excepciones de manera robusta y depurar el código de forma efectiva para asegurar la estabilidad y fiabilidad del sistema. El objetivo de este reto es fortalecer tus habilidades en estos aspectos, a través de la identificación, manejo y depuración de excepciones en un contexto realista de desarrollo backend.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Manejo de Excepciones y Depuración Efectiva |
| **Nivel** | senior-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Excepciones

**Objetivo:** Identificar posibles puntos de fallo en el sistema y las excepciones que pueden ocurrir.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el sistema de gestión de cartera de inversiones y enumera las posibles excepciones que pueden ocurrir en diferentes operaciones (ej. actualización de cartera, consulta de inversiones).

**Entregable:** Lista de posibles excepciones con una breve descripción de cada una.

<details>
<summary>Pistas de conocimiento</summary>

- Considera tanto las excepciones esperadas como las inesperadas.
- Piensa en cómo las operaciones del sistema pueden fallar.

</details>

### Fase 2: Manejo de Excepciones

**Objetivo:** Implementar un manejo adecuado de las excepciones identificadas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Decide cómo manejar cada excepción identificada en la fase anterior. Considera el impacto de cada excepción en el sistema y cómo debería ser manejado para minimizar el impacto en el usuario y en la operación del sistema.

**Entregable:** Descripción del manejo de cada excepción, incluyendo el tipo de respuesta que se debe dar al usuario y cualquier acción adicional que se deba tomar.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo comunicar efectivamente el error al usuario.
- Considera la posibilidad de reintentar operaciones fallidas.

</details>

### Fase 3: Depuración Efectiva

**Objetivo:** Aplicar técnicas avanzadas de depuración para encontrar y solucionar problemas en el código.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Selecciona una excepción y simula un escenario donde esta excepción ocurre. Utiliza técnicas de depuración para encontrar y solucionar el problema.

**Entregable:** Descripción del problema encontrado, las técnicas de depuración utilizadas y la solución implementada.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza logs para rastrear el flujo del programa.
- Considera el uso de herramientas de depuración para inspeccionar el estado del programa.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una excepción y por qué es importante manejarla en un sistema de gestión de cartera de inversiones?
- **paraQueSirve**: ¿Para qué sirve el manejo de excepciones en este contexto?
- **comoSeUsa**: ¿Cómo se usa el manejo de excepciones para mejorar la estabilidad y fiabilidad del sistema?
- **erroresComunes**: ¿Cuáles son algunos errores comunes al manejar excepciones y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el proceso de depuración efectiva?

## Criterios de Evaluacion

- Identificar posibles excepciones en un sistema de gestión de cartera de inversiones.
- Implementar un manejo adecuado de las excepciones identificadas.
- Aplicar técnicas avanzadas de depuración para encontrar y solucionar problemas en el código.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
