-- Copyright (C) 2023  Intel Corporation. All rights reserved.
-- Your use of Intel Corporation's design tools, logic functions 
-- and other software and tools, and any partner logic 
-- functions, and any output files from any of the foregoing 
-- (including device programming or simulation files), and any 
-- associated documentation or information are expressly subject 
-- to the terms and conditions of the Intel Program License 
-- Subscription Agreement, the Intel Quartus Prime License Agreement,
-- the Intel FPGA IP License Agreement, or other applicable license
-- agreement, including, without limitation, that your use is for
-- the sole purpose of programming logic devices manufactured by
-- Intel and sold by Intel or its authorized distributors.  Please
-- refer to the applicable agreement for further details, at
-- https://fpgasoftware.intel.com/eula.

-- VENDOR "Altera"
-- PROGRAM "Quartus Prime"
-- VERSION "Version 22.1std.2 Build 922 07/20/2023 SC Lite Edition"

-- DATE "05/17/2024 11:28:44"

-- 
-- Device: Altera EP4CE115F29C7 Package FBGA780
-- 

-- 
-- This VHDL file should be used for Questa Intel FPGA (VHDL) only
-- 

LIBRARY CYCLONEIVE;
LIBRARY IEEE;
USE CYCLONEIVE.CYCLONEIVE_COMPONENTS.ALL;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY 	hard_block IS
    PORT (
	devoe : IN std_logic;
	devclrn : IN std_logic;
	devpor : IN std_logic
	);
END hard_block;

-- Design Ports Information
-- ~ALTERA_ASDO_DATA1~	=>  Location: PIN_F4,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- ~ALTERA_FLASH_nCE_nCSO~	=>  Location: PIN_E2,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- ~ALTERA_DCLK~	=>  Location: PIN_P3,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- ~ALTERA_DATA0~	=>  Location: PIN_N7,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- ~ALTERA_nCEO~	=>  Location: PIN_P28,	 I/O Standard: 2.5 V,	 Current Strength: 8mA


ARCHITECTURE structure OF hard_block IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL \~ALTERA_ASDO_DATA1~~padout\ : std_logic;
SIGNAL \~ALTERA_FLASH_nCE_nCSO~~padout\ : std_logic;
SIGNAL \~ALTERA_DATA0~~padout\ : std_logic;
SIGNAL \~ALTERA_ASDO_DATA1~~ibuf_o\ : std_logic;
SIGNAL \~ALTERA_FLASH_nCE_nCSO~~ibuf_o\ : std_logic;
SIGNAL \~ALTERA_DATA0~~ibuf_o\ : std_logic;

BEGIN

ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;
END structure;


LIBRARY ALTERA;
LIBRARY CYCLONEIVE;
LIBRARY IEEE;
USE ALTERA.ALTERA_PRIMITIVES_COMPONENTS.ALL;
USE CYCLONEIVE.CYCLONEIVE_COMPONENTS.ALL;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY 	DrinksMachine IS
    PORT (
	CLOCK_50 : IN std_logic;
	SW : IN std_logic_vector(1 DOWNTO 0);
	KEY : IN std_logic_vector(0 DOWNTO 0);
	LEDG : OUT std_logic_vector(0 DOWNTO 0)
	);
END DrinksMachine;

-- Design Ports Information
-- LEDG[0]	=>  Location: PIN_E12,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[1]	=>  Location: PIN_D10,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[0]	=>  Location: PIN_F12,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- KEY[0]	=>  Location: PIN_C10,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- CLOCK_50	=>  Location: PIN_J1,	 I/O Standard: 2.5 V,	 Current Strength: Default


ARCHITECTURE structure OF DrinksMachine IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL ww_CLOCK_50 : std_logic;
SIGNAL ww_SW : std_logic_vector(1 DOWNTO 0);
SIGNAL ww_KEY : std_logic_vector(0 DOWNTO 0);
SIGNAL ww_LEDG : std_logic_vector(0 DOWNTO 0);
SIGNAL \CLOCK_50~inputclkctrl_INCLK_bus\ : std_logic_vector(3 DOWNTO 0);
SIGNAL \LEDG[0]~output_o\ : std_logic;
SIGNAL \CLOCK_50~input_o\ : std_logic;
SIGNAL \CLOCK_50~inputclkctrl_outclk\ : std_logic;
SIGNAL \SW[1]~input_o\ : std_logic;
SIGNAL \SW[0]~input_o\ : std_logic;
SIGNAL \drinks|comb_proc~0_combout\ : std_logic;
SIGNAL \KEY[0]~input_o\ : std_logic;
SIGNAL \drinks|s_currentState~17_combout\ : std_logic;
SIGNAL \drinks|s_currentState.Idle~q\ : std_logic;
SIGNAL \drinks|s_currentState~16_combout\ : std_logic;
SIGNAL \drinks|s_currentState~11_combout\ : std_logic;
SIGNAL \drinks|s_currentState.E1~q\ : std_logic;
SIGNAL \drinks|s_currentState~10_combout\ : std_logic;
SIGNAL \drinks|s_currentState.E2~q\ : std_logic;
SIGNAL \drinks|s_currentState~12_combout\ : std_logic;
SIGNAL \drinks|s_currentState~13_combout\ : std_logic;
SIGNAL \drinks|s_currentState.E3~q\ : std_logic;
SIGNAL \drinks|s_currentState~14_combout\ : std_logic;
SIGNAL \drinks|s_currentState~15_combout\ : std_logic;
SIGNAL \drinks|s_currentState.E4~q\ : std_logic;
SIGNAL \drinks|s_currentState~8_combout\ : std_logic;
SIGNAL \drinks|s_currentState~9_combout\ : std_logic;
SIGNAL \drinks|s_currentState.E5~q\ : std_logic;

COMPONENT hard_block
    PORT (
	devoe : IN std_logic;
	devclrn : IN std_logic;
	devpor : IN std_logic);
END COMPONENT;

BEGIN

ww_CLOCK_50 <= CLOCK_50;
ww_SW <= SW;
ww_KEY <= KEY;
LEDG <= ww_LEDG;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;

\CLOCK_50~inputclkctrl_INCLK_bus\ <= (vcc & vcc & vcc & \CLOCK_50~input_o\);
auto_generated_inst : hard_block
PORT MAP (
	devoe => ww_devoe,
	devclrn => ww_devclrn,
	devpor => ww_devpor);

-- Location: IOOBUF_X33_Y73_N2
\LEDG[0]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \drinks|s_currentState.E5~q\,
	devoe => ww_devoe,
	o => \LEDG[0]~output_o\);

-- Location: IOIBUF_X0_Y36_N8
\CLOCK_50~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_CLOCK_50,
	o => \CLOCK_50~input_o\);

-- Location: CLKCTRL_G2
\CLOCK_50~inputclkctrl\ : cycloneive_clkctrl
-- pragma translate_off
GENERIC MAP (
	clock_type => "global clock",
	ena_register_mode => "none")
-- pragma translate_on
PORT MAP (
	inclk => \CLOCK_50~inputclkctrl_INCLK_bus\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	outclk => \CLOCK_50~inputclkctrl_outclk\);

-- Location: IOIBUF_X35_Y73_N22
\SW[1]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(1),
	o => \SW[1]~input_o\);

-- Location: IOIBUF_X33_Y73_N8
\SW[0]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(0),
	o => \SW[0]~input_o\);

-- Location: LCCOMB_X34_Y72_N30
\drinks|comb_proc~0\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|comb_proc~0_combout\ = (!\SW[1]~input_o\ & !\SW[0]~input_o\)

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000010100000101",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[1]~input_o\,
	datac => \SW[0]~input_o\,
	combout => \drinks|comb_proc~0_combout\);

-- Location: IOIBUF_X35_Y73_N15
\KEY[0]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_KEY(0),
	o => \KEY[0]~input_o\);

-- Location: LCCOMB_X34_Y72_N4
\drinks|s_currentState~17\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~17_combout\ = (!\KEY[0]~input_o\ & (!\drinks|s_currentState.E5~q\ & ((\drinks|s_currentState.Idle~q\) # (!\drinks|comb_proc~0_combout\))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000000000110001",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \drinks|comb_proc~0_combout\,
	datab => \KEY[0]~input_o\,
	datac => \drinks|s_currentState.Idle~q\,
	datad => \drinks|s_currentState.E5~q\,
	combout => \drinks|s_currentState~17_combout\);

-- Location: FF_X34_Y72_N5
\drinks|s_currentState.Idle\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \CLOCK_50~inputclkctrl_outclk\,
	d => \drinks|s_currentState~17_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \drinks|s_currentState.Idle~q\);

-- Location: LCCOMB_X34_Y72_N8
\drinks|s_currentState~16\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~16_combout\ = (\SW[0]~input_o\ & (!\KEY[0]~input_o\ & !\drinks|s_currentState.Idle~q\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000000000001010",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[0]~input_o\,
	datac => \KEY[0]~input_o\,
	datad => \drinks|s_currentState.Idle~q\,
	combout => \drinks|s_currentState~16_combout\);

-- Location: LCCOMB_X34_Y72_N26
\drinks|s_currentState~11\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~11_combout\ = (\SW[0]~input_o\) # ((\KEY[0]~input_o\) # (\SW[1]~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1111111011111110",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[0]~input_o\,
	datab => \KEY[0]~input_o\,
	datac => \SW[1]~input_o\,
	combout => \drinks|s_currentState~11_combout\);

-- Location: FF_X34_Y72_N9
\drinks|s_currentState.E1\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \CLOCK_50~inputclkctrl_outclk\,
	d => \drinks|s_currentState~16_combout\,
	ena => \drinks|s_currentState~11_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \drinks|s_currentState.E1~q\);

-- Location: LCCOMB_X34_Y72_N22
\drinks|s_currentState~10\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~10_combout\ = (\SW[0]~input_o\ & (\drinks|s_currentState.E1~q\ & !\KEY[0]~input_o\))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0000100000001000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[0]~input_o\,
	datab => \drinks|s_currentState.E1~q\,
	datac => \KEY[0]~input_o\,
	combout => \drinks|s_currentState~10_combout\);

-- Location: FF_X34_Y72_N23
\drinks|s_currentState.E2\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \CLOCK_50~inputclkctrl_outclk\,
	d => \drinks|s_currentState~10_combout\,
	ena => \drinks|s_currentState~11_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \drinks|s_currentState.E2~q\);

-- Location: LCCOMB_X34_Y72_N2
\drinks|s_currentState~12\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~12_combout\ = (\SW[1]~input_o\ & (!\drinks|s_currentState.Idle~q\)) # (!\SW[1]~input_o\ & ((\drinks|s_currentState.E3~q\)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0101111100001010",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[1]~input_o\,
	datac => \drinks|s_currentState.Idle~q\,
	datad => \drinks|s_currentState.E3~q\,
	combout => \drinks|s_currentState~12_combout\);

-- Location: LCCOMB_X34_Y72_N20
\drinks|s_currentState~13\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~13_combout\ = (!\KEY[0]~input_o\ & ((\SW[0]~input_o\ & (\drinks|s_currentState.E2~q\)) # (!\SW[0]~input_o\ & ((\drinks|s_currentState~12_combout\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0011000100100000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[0]~input_o\,
	datab => \KEY[0]~input_o\,
	datac => \drinks|s_currentState.E2~q\,
	datad => \drinks|s_currentState~12_combout\,
	combout => \drinks|s_currentState~13_combout\);

-- Location: FF_X34_Y72_N21
\drinks|s_currentState.E3\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \CLOCK_50~inputclkctrl_outclk\,
	d => \drinks|s_currentState~13_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \drinks|s_currentState.E3~q\);

-- Location: LCCOMB_X34_Y72_N24
\drinks|s_currentState~14\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~14_combout\ = (\SW[1]~input_o\ & (\drinks|s_currentState.E1~q\)) # (!\SW[1]~input_o\ & ((\drinks|s_currentState.E4~q\)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1111010110100000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[1]~input_o\,
	datac => \drinks|s_currentState.E1~q\,
	datad => \drinks|s_currentState.E4~q\,
	combout => \drinks|s_currentState~14_combout\);

-- Location: LCCOMB_X34_Y72_N28
\drinks|s_currentState~15\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~15_combout\ = (!\KEY[0]~input_o\ & ((\SW[0]~input_o\ & (\drinks|s_currentState.E3~q\)) # (!\SW[0]~input_o\ & ((\drinks|s_currentState~14_combout\)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0011000100100000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[0]~input_o\,
	datab => \KEY[0]~input_o\,
	datac => \drinks|s_currentState.E3~q\,
	datad => \drinks|s_currentState~14_combout\,
	combout => \drinks|s_currentState~15_combout\);

-- Location: FF_X34_Y72_N29
\drinks|s_currentState.E4\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \CLOCK_50~inputclkctrl_outclk\,
	d => \drinks|s_currentState~15_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \drinks|s_currentState.E4~q\);

-- Location: LCCOMB_X34_Y72_N18
\drinks|s_currentState~8\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~8_combout\ = (\SW[1]~input_o\ & (!\SW[0]~input_o\ & ((\drinks|s_currentState.E2~q\) # (\drinks|s_currentState.E3~q\))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0010001000100000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[1]~input_o\,
	datab => \SW[0]~input_o\,
	datac => \drinks|s_currentState.E2~q\,
	datad => \drinks|s_currentState.E3~q\,
	combout => \drinks|s_currentState~8_combout\);

-- Location: LCCOMB_X34_Y72_N16
\drinks|s_currentState~9\ : cycloneive_lcell_comb
-- Equation(s):
-- \drinks|s_currentState~9_combout\ = (!\KEY[0]~input_o\ & ((\drinks|s_currentState~8_combout\) # ((!\drinks|comb_proc~0_combout\ & \drinks|s_currentState.E4~q\))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0011001100010000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \drinks|comb_proc~0_combout\,
	datab => \KEY[0]~input_o\,
	datac => \drinks|s_currentState.E4~q\,
	datad => \drinks|s_currentState~8_combout\,
	combout => \drinks|s_currentState~9_combout\);

-- Location: FF_X34_Y72_N17
\drinks|s_currentState.E5\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \CLOCK_50~inputclkctrl_outclk\,
	d => \drinks|s_currentState~9_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \drinks|s_currentState.E5~q\);

ww_LEDG(0) <= \LEDG[0]~output_o\;
END structure;


