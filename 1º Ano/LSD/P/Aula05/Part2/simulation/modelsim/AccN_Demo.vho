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

-- DATE "03/15/2024 11:26:39"

-- 
-- Device: Altera EP4CE115F29C7 Package FBGA780
-- 

-- 
-- This VHDL file should be used for ModelSim (VHDL) only
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

ENTITY 	AccN_Demo IS
    PORT (
	LEDR : OUT std_logic_vector(7 DOWNTO 0);
	SW : IN std_logic_vector(9 DOWNTO 0);
	KEY : IN std_logic_vector(0 DOWNTO 0)
	);
END AccN_Demo;

-- Design Ports Information
-- LEDR[7]	=>  Location: PIN_H19,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[6]	=>  Location: PIN_J19,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[5]	=>  Location: PIN_E18,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[4]	=>  Location: PIN_F18,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[3]	=>  Location: PIN_F21,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[2]	=>  Location: PIN_E19,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[1]	=>  Location: PIN_F19,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- LEDR[0]	=>  Location: PIN_G19,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- KEY[0]	=>  Location: PIN_M23,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[7]	=>  Location: PIN_AB26,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[6]	=>  Location: PIN_AD26,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[5]	=>  Location: PIN_AC26,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[4]	=>  Location: PIN_AB27,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[3]	=>  Location: PIN_AD27,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[2]	=>  Location: PIN_AC27,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[1]	=>  Location: PIN_AC28,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[0]	=>  Location: PIN_AB28,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[8]	=>  Location: PIN_AC25,	 I/O Standard: 2.5 V,	 Current Strength: Default
-- SW[9]	=>  Location: PIN_AB25,	 I/O Standard: 2.5 V,	 Current Strength: Default


ARCHITECTURE structure OF AccN_Demo IS
SIGNAL gnd : std_logic := '0';
SIGNAL vcc : std_logic := '1';
SIGNAL unknown : std_logic := 'X';
SIGNAL devoe : std_logic := '1';
SIGNAL devclrn : std_logic := '1';
SIGNAL devpor : std_logic := '1';
SIGNAL ww_devoe : std_logic;
SIGNAL ww_devclrn : std_logic;
SIGNAL ww_devpor : std_logic;
SIGNAL ww_LEDR : std_logic_vector(7 DOWNTO 0);
SIGNAL ww_SW : std_logic_vector(9 DOWNTO 0);
SIGNAL ww_KEY : std_logic_vector(0 DOWNTO 0);
SIGNAL \LEDR[7]~output_o\ : std_logic;
SIGNAL \LEDR[6]~output_o\ : std_logic;
SIGNAL \LEDR[5]~output_o\ : std_logic;
SIGNAL \LEDR[4]~output_o\ : std_logic;
SIGNAL \LEDR[3]~output_o\ : std_logic;
SIGNAL \LEDR[2]~output_o\ : std_logic;
SIGNAL \LEDR[1]~output_o\ : std_logic;
SIGNAL \LEDR[0]~output_o\ : std_logic;
SIGNAL \KEY[0]~input_o\ : std_logic;
SIGNAL \SW[7]~input_o\ : std_logic;
SIGNAL \SW[6]~input_o\ : std_logic;
SIGNAL \SW[5]~input_o\ : std_logic;
SIGNAL \SW[4]~input_o\ : std_logic;
SIGNAL \SW[3]~input_o\ : std_logic;
SIGNAL \SW[2]~input_o\ : std_logic;
SIGNAL \SW[1]~input_o\ : std_logic;
SIGNAL \SW[0]~input_o\ : std_logic;
SIGNAL \inst|registo|dataOut[0]~8_combout\ : std_logic;
SIGNAL \SW[8]~input_o\ : std_logic;
SIGNAL \SW[9]~input_o\ : std_logic;
SIGNAL \inst|registo|dataOut[7]~24_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[0]~9\ : std_logic;
SIGNAL \inst|registo|dataOut[1]~10_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[1]~11\ : std_logic;
SIGNAL \inst|registo|dataOut[2]~12_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[2]~13\ : std_logic;
SIGNAL \inst|registo|dataOut[3]~14_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[3]~15\ : std_logic;
SIGNAL \inst|registo|dataOut[4]~16_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[4]~17\ : std_logic;
SIGNAL \inst|registo|dataOut[5]~18_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[5]~19\ : std_logic;
SIGNAL \inst|registo|dataOut[6]~20_combout\ : std_logic;
SIGNAL \inst|registo|dataOut[6]~21\ : std_logic;
SIGNAL \inst|registo|dataOut[7]~22_combout\ : std_logic;
SIGNAL \inst|registo|dataOut\ : std_logic_vector(7 DOWNTO 0);

COMPONENT hard_block
    PORT (
	devoe : IN std_logic;
	devclrn : IN std_logic;
	devpor : IN std_logic);
END COMPONENT;

BEGIN

LEDR <= ww_LEDR;
ww_SW <= SW;
ww_KEY <= KEY;
ww_devoe <= devoe;
ww_devclrn <= devclrn;
ww_devpor <= devpor;
auto_generated_inst : hard_block
PORT MAP (
	devoe => ww_devoe,
	devclrn => ww_devclrn,
	devpor => ww_devpor);

-- Location: IOOBUF_X72_Y73_N2
\LEDR[7]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(7),
	devoe => ww_devoe,
	o => \LEDR[7]~output_o\);

-- Location: IOOBUF_X72_Y73_N9
\LEDR[6]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(6),
	devoe => ww_devoe,
	o => \LEDR[6]~output_o\);

-- Location: IOOBUF_X87_Y73_N9
\LEDR[5]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(5),
	devoe => ww_devoe,
	o => \LEDR[5]~output_o\);

-- Location: IOOBUF_X87_Y73_N16
\LEDR[4]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(4),
	devoe => ww_devoe,
	o => \LEDR[4]~output_o\);

-- Location: IOOBUF_X107_Y73_N16
\LEDR[3]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(3),
	devoe => ww_devoe,
	o => \LEDR[3]~output_o\);

-- Location: IOOBUF_X94_Y73_N9
\LEDR[2]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(2),
	devoe => ww_devoe,
	o => \LEDR[2]~output_o\);

-- Location: IOOBUF_X94_Y73_N2
\LEDR[1]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(1),
	devoe => ww_devoe,
	o => \LEDR[1]~output_o\);

-- Location: IOOBUF_X69_Y73_N16
\LEDR[0]~output\ : cycloneive_io_obuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	open_drain_output => "false")
-- pragma translate_on
PORT MAP (
	i => \inst|registo|dataOut\(0),
	devoe => ww_devoe,
	o => \LEDR[0]~output_o\);

-- Location: IOIBUF_X115_Y40_N8
\KEY[0]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_KEY(0),
	o => \KEY[0]~input_o\);

-- Location: IOIBUF_X115_Y15_N1
\SW[7]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(7),
	o => \SW[7]~input_o\);

-- Location: IOIBUF_X115_Y10_N1
\SW[6]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(6),
	o => \SW[6]~input_o\);

-- Location: IOIBUF_X115_Y11_N8
\SW[5]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(5),
	o => \SW[5]~input_o\);

-- Location: IOIBUF_X115_Y18_N8
\SW[4]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(4),
	o => \SW[4]~input_o\);

-- Location: IOIBUF_X115_Y13_N8
\SW[3]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(3),
	o => \SW[3]~input_o\);

-- Location: IOIBUF_X115_Y15_N8
\SW[2]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(2),
	o => \SW[2]~input_o\);

-- Location: IOIBUF_X115_Y14_N1
\SW[1]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(1),
	o => \SW[1]~input_o\);

-- Location: IOIBUF_X115_Y17_N1
\SW[0]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(0),
	o => \SW[0]~input_o\);

-- Location: LCCOMB_X114_Y40_N14
\inst|registo|dataOut[0]~8\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[0]~8_combout\ = (\SW[0]~input_o\ & (\inst|registo|dataOut\(0) $ (VCC))) # (!\SW[0]~input_o\ & (\inst|registo|dataOut\(0) & VCC))
-- \inst|registo|dataOut[0]~9\ = CARRY((\SW[0]~input_o\ & \inst|registo|dataOut\(0)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0110011010001000",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[0]~input_o\,
	datab => \inst|registo|dataOut\(0),
	datad => VCC,
	combout => \inst|registo|dataOut[0]~8_combout\,
	cout => \inst|registo|dataOut[0]~9\);

-- Location: IOIBUF_X115_Y4_N22
\SW[8]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(8),
	o => \SW[8]~input_o\);

-- Location: IOIBUF_X115_Y16_N8
\SW[9]~input\ : cycloneive_io_ibuf
-- pragma translate_off
GENERIC MAP (
	bus_hold => "false",
	simulate_z_as => "z")
-- pragma translate_on
PORT MAP (
	i => ww_SW(9),
	o => \SW[9]~input_o\);

-- Location: LCCOMB_X114_Y40_N12
\inst|registo|dataOut[7]~24\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[7]~24_combout\ = (\SW[9]~input_o\) # (\SW[8]~input_o\)

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1111101011111010",
	sum_lutc_input => "datac")
-- pragma translate_on
PORT MAP (
	dataa => \SW[9]~input_o\,
	datac => \SW[8]~input_o\,
	combout => \inst|registo|dataOut[7]~24_combout\);

-- Location: FF_X114_Y40_N15
\inst|registo|dataOut[0]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[0]~8_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(0));

-- Location: LCCOMB_X114_Y40_N16
\inst|registo|dataOut[1]~10\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[1]~10_combout\ = (\SW[1]~input_o\ & ((\inst|registo|dataOut\(1) & (\inst|registo|dataOut[0]~9\ & VCC)) # (!\inst|registo|dataOut\(1) & (!\inst|registo|dataOut[0]~9\)))) # (!\SW[1]~input_o\ & ((\inst|registo|dataOut\(1) & 
-- (!\inst|registo|dataOut[0]~9\)) # (!\inst|registo|dataOut\(1) & ((\inst|registo|dataOut[0]~9\) # (GND)))))
-- \inst|registo|dataOut[1]~11\ = CARRY((\SW[1]~input_o\ & (!\inst|registo|dataOut\(1) & !\inst|registo|dataOut[0]~9\)) # (!\SW[1]~input_o\ & ((!\inst|registo|dataOut[0]~9\) # (!\inst|registo|dataOut\(1)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1001011000010111",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \SW[1]~input_o\,
	datab => \inst|registo|dataOut\(1),
	datad => VCC,
	cin => \inst|registo|dataOut[0]~9\,
	combout => \inst|registo|dataOut[1]~10_combout\,
	cout => \inst|registo|dataOut[1]~11\);

-- Location: FF_X114_Y40_N17
\inst|registo|dataOut[1]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[1]~10_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(1));

-- Location: LCCOMB_X114_Y40_N18
\inst|registo|dataOut[2]~12\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[2]~12_combout\ = ((\SW[2]~input_o\ $ (\inst|registo|dataOut\(2) $ (!\inst|registo|dataOut[1]~11\)))) # (GND)
-- \inst|registo|dataOut[2]~13\ = CARRY((\SW[2]~input_o\ & ((\inst|registo|dataOut\(2)) # (!\inst|registo|dataOut[1]~11\))) # (!\SW[2]~input_o\ & (\inst|registo|dataOut\(2) & !\inst|registo|dataOut[1]~11\)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0110100110001110",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \SW[2]~input_o\,
	datab => \inst|registo|dataOut\(2),
	datad => VCC,
	cin => \inst|registo|dataOut[1]~11\,
	combout => \inst|registo|dataOut[2]~12_combout\,
	cout => \inst|registo|dataOut[2]~13\);

-- Location: FF_X114_Y40_N19
\inst|registo|dataOut[2]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[2]~12_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(2));

-- Location: LCCOMB_X114_Y40_N20
\inst|registo|dataOut[3]~14\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[3]~14_combout\ = (\SW[3]~input_o\ & ((\inst|registo|dataOut\(3) & (\inst|registo|dataOut[2]~13\ & VCC)) # (!\inst|registo|dataOut\(3) & (!\inst|registo|dataOut[2]~13\)))) # (!\SW[3]~input_o\ & ((\inst|registo|dataOut\(3) & 
-- (!\inst|registo|dataOut[2]~13\)) # (!\inst|registo|dataOut\(3) & ((\inst|registo|dataOut[2]~13\) # (GND)))))
-- \inst|registo|dataOut[3]~15\ = CARRY((\SW[3]~input_o\ & (!\inst|registo|dataOut\(3) & !\inst|registo|dataOut[2]~13\)) # (!\SW[3]~input_o\ & ((!\inst|registo|dataOut[2]~13\) # (!\inst|registo|dataOut\(3)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1001011000010111",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \SW[3]~input_o\,
	datab => \inst|registo|dataOut\(3),
	datad => VCC,
	cin => \inst|registo|dataOut[2]~13\,
	combout => \inst|registo|dataOut[3]~14_combout\,
	cout => \inst|registo|dataOut[3]~15\);

-- Location: FF_X114_Y40_N21
\inst|registo|dataOut[3]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[3]~14_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(3));

-- Location: LCCOMB_X114_Y40_N22
\inst|registo|dataOut[4]~16\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[4]~16_combout\ = ((\inst|registo|dataOut\(4) $ (\SW[4]~input_o\ $ (!\inst|registo|dataOut[3]~15\)))) # (GND)
-- \inst|registo|dataOut[4]~17\ = CARRY((\inst|registo|dataOut\(4) & ((\SW[4]~input_o\) # (!\inst|registo|dataOut[3]~15\))) # (!\inst|registo|dataOut\(4) & (\SW[4]~input_o\ & !\inst|registo|dataOut[3]~15\)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0110100110001110",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \inst|registo|dataOut\(4),
	datab => \SW[4]~input_o\,
	datad => VCC,
	cin => \inst|registo|dataOut[3]~15\,
	combout => \inst|registo|dataOut[4]~16_combout\,
	cout => \inst|registo|dataOut[4]~17\);

-- Location: FF_X114_Y40_N23
\inst|registo|dataOut[4]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[4]~16_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(4));

-- Location: LCCOMB_X114_Y40_N24
\inst|registo|dataOut[5]~18\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[5]~18_combout\ = (\SW[5]~input_o\ & ((\inst|registo|dataOut\(5) & (\inst|registo|dataOut[4]~17\ & VCC)) # (!\inst|registo|dataOut\(5) & (!\inst|registo|dataOut[4]~17\)))) # (!\SW[5]~input_o\ & ((\inst|registo|dataOut\(5) & 
-- (!\inst|registo|dataOut[4]~17\)) # (!\inst|registo|dataOut\(5) & ((\inst|registo|dataOut[4]~17\) # (GND)))))
-- \inst|registo|dataOut[5]~19\ = CARRY((\SW[5]~input_o\ & (!\inst|registo|dataOut\(5) & !\inst|registo|dataOut[4]~17\)) # (!\SW[5]~input_o\ & ((!\inst|registo|dataOut[4]~17\) # (!\inst|registo|dataOut\(5)))))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1001011000010111",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \SW[5]~input_o\,
	datab => \inst|registo|dataOut\(5),
	datad => VCC,
	cin => \inst|registo|dataOut[4]~17\,
	combout => \inst|registo|dataOut[5]~18_combout\,
	cout => \inst|registo|dataOut[5]~19\);

-- Location: FF_X114_Y40_N25
\inst|registo|dataOut[5]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[5]~18_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(5));

-- Location: LCCOMB_X114_Y40_N26
\inst|registo|dataOut[6]~20\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[6]~20_combout\ = ((\inst|registo|dataOut\(6) $ (\SW[6]~input_o\ $ (!\inst|registo|dataOut[5]~19\)))) # (GND)
-- \inst|registo|dataOut[6]~21\ = CARRY((\inst|registo|dataOut\(6) & ((\SW[6]~input_o\) # (!\inst|registo|dataOut[5]~19\))) # (!\inst|registo|dataOut\(6) & (\SW[6]~input_o\ & !\inst|registo|dataOut[5]~19\)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "0110100110001110",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	dataa => \inst|registo|dataOut\(6),
	datab => \SW[6]~input_o\,
	datad => VCC,
	cin => \inst|registo|dataOut[5]~19\,
	combout => \inst|registo|dataOut[6]~20_combout\,
	cout => \inst|registo|dataOut[6]~21\);

-- Location: FF_X114_Y40_N27
\inst|registo|dataOut[6]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[6]~20_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(6));

-- Location: LCCOMB_X114_Y40_N28
\inst|registo|dataOut[7]~22\ : cycloneive_lcell_comb
-- Equation(s):
-- \inst|registo|dataOut[7]~22_combout\ = \SW[7]~input_o\ $ (\inst|registo|dataOut[6]~21\ $ (\inst|registo|dataOut\(7)))

-- pragma translate_off
GENERIC MAP (
	lut_mask => "1100001100111100",
	sum_lutc_input => "cin")
-- pragma translate_on
PORT MAP (
	datab => \SW[7]~input_o\,
	datad => \inst|registo|dataOut\(7),
	cin => \inst|registo|dataOut[6]~21\,
	combout => \inst|registo|dataOut[7]~22_combout\);

-- Location: FF_X114_Y40_N29
\inst|registo|dataOut[7]\ : dffeas
-- pragma translate_off
GENERIC MAP (
	is_wysiwyg => "true",
	power_up => "low")
-- pragma translate_on
PORT MAP (
	clk => \KEY[0]~input_o\,
	d => \inst|registo|dataOut[7]~22_combout\,
	sclr => \SW[8]~input_o\,
	ena => \inst|registo|dataOut[7]~24_combout\,
	devclrn => ww_devclrn,
	devpor => ww_devpor,
	q => \inst|registo|dataOut\(7));

ww_LEDR(7) <= \LEDR[7]~output_o\;

ww_LEDR(6) <= \LEDR[6]~output_o\;

ww_LEDR(5) <= \LEDR[5]~output_o\;

ww_LEDR(4) <= \LEDR[4]~output_o\;

ww_LEDR(3) <= \LEDR[3]~output_o\;

ww_LEDR(2) <= \LEDR[2]~output_o\;

ww_LEDR(1) <= \LEDR[1]~output_o\;

ww_LEDR(0) <= \LEDR[0]~output_o\;
END structure;


