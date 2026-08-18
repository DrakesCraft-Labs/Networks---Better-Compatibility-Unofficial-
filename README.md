<p align="center">
  <img src="https://raw.githubusercontent.com/DrakesCraft-Labs/Networks---Better-Compatibility-Unofficial-/main/banner.svg" width="100%" alt="NETWORKS BETTER COMPATIBILITY Animated Banner" />
</p>

# Networks - Better Compatibility (Unofficial)

Fork de compatibilidad y estabilización de **Networks** para **Slimefun 4**, adaptado por **DrakesCraft Labs** para Paper 1.20.6 / 1.21.11 en Java 21.

---

## 🎯 Mejoras Clave en esta Versión

- **Estabilidad de Inicialización**: Corrección de fallos en el orden de inicialización estática que producían `NullPointerException` al cargar ítems core de Slimefun.
- **Mapeo de NMS y Partículas**: Adaptación de identificadores de encantamientos, efectos y partículas para Minecraft moderno.
- **Rendimiento de Red**: Optimización en los algoritmos de escaneo de cables y celdas de almacenamiento.

---

## 🛠️ Entorno y Dependencias

- **Servidor**: Paper / Purpur 1.20.6 - 1.21.11
- **Java**: 21
- **Dependencias**:
  - `Slimefun4-Drake`

## Qué añade al juego

No idea yet


Todo se fabrica y se investiga desde la guía normal (`/sf guide`), como cualquier otro contenido
de Slimefun: no hace falta ningún comando especial para empezar.

## Compatibilidad

| | |
|---|---|
| Servidor | Paper / Purpur **1.21.11** |
| Java | **21** |
| Requiere | [Slimefun4-Drake](https://github.com/DrakesCraft-Labs/Slimefun4-Drake) |
| Lado | Solo servidor — quien juega no instala nada |
| Versión | ${project.version} |

## Instalación

1. Descarga el `.jar` de la última versión.
2. Déjalo en la carpeta `plugins/` del servidor, junto a Slimefun.
3. Reinicia el servidor. Los objetos aparecen solos en la guía.

> Este addon está portado al fork de Slimefun de DrakesCraft. Con el Slimefun original puede no
> cargar, porque cambia el espacio de nombres de las clases.

## Créditos
- Sefiraat

Port y mantenimiento por **DrakesCraft Labs**. La autoría original es de quien figura arriba; el detalle está en [docs/UPSTREAM_ATTRIBUTION.md](https://raw.githubusercontent.com/DrakesCraft-Labs/Networks---Better-Compatibility-Unofficial-/main/docs/UPSTREAM_ATTRIBUTION.md).

Licencia **GPL-3.0-only**.
