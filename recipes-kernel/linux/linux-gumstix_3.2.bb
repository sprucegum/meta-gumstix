require linux.inc

DESCRIPTION = "Linux kernel for OMAP processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "pepper"

BOOT_SPLASH ?= "logo_linux_clut224-generic.ppm"
PV = "3.2"

S = "${WORKDIR}/git"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/gumstix/linux.git;branch=am335x-3.2;protocol=git \
	   file://defconfig \
           file://${BOOT_SPLASH} \
           "

