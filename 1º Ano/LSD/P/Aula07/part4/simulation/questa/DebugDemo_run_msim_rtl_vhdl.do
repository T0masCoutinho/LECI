transcript on
if {[file exists rtl_work]} {
	vdel -lib rtl_work -all
}
vlib rtl_work
vmap work rtl_work

vcom -93 -work work {/home/tomtom/Documents/UNI/LSD/P/Aula07/part4/CntUp.vhd}
vcom -93 -work work {/home/tomtom/Documents/UNI/LSD/P/Aula07/part4/DebugDemo.vhd}

