# rotacionador-escala-enfermeiros

## Descrição do Problema
Gerencia a escala de plantão de enfermeiros em um hospital, aplicando regras de folga obrigatória após 3 turnos consecutivos e limitando o total de horas semanais.

## Requisitos
- Definir lista de enfermeiros e seus turnos iniciais
- Aplicar regra de folga após 3 turnos seguidos
- Validar limite máximo de 40 horas semanais

## Exemplo de Uso
Enfermeiros: Ana (20h), Bruno (15h), Carla (25h)
Turnos iniciais: Ana=2, Bruno=1, Carla=3

Saída:
Ana: Alocada (4 turnos seguidos, 35h)
Bruno: Alocada (2 turnos seguidos, 30h)
Carla: Folga obrigatória (3 turnos seguidos)